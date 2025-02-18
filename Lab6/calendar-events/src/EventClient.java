
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 * Client for uploading events to the server.
 * 
 * Students do not need to change this class.
 */
public class EventClient
{

    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private final OkHttpClient client = new OkHttpClient();
    private ObjectMapper objectMapper;

    public EventClient()
    {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    public String postEvent(String url, Event event, String username, String password) throws Exception
    {
        // remove the id from the event
        // the database will assign a new id
        event.setId(null);
        event.setUsername(username);
        String json = objectMapper.writeValueAsString(event);
        RequestBody body = RequestBody.create(json, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("X-username", username)
                .addHeader("X-password", password)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                if (response.code() == 401)
                {
                    throw new IOException("Authentation failed (username and password did not match): " + response);
                }
                throw new IOException("Failed to insert event: " + response);
            }

            return response.body().string();
        }
    }

}

