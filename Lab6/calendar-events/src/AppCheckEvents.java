import java.util.List;

public class AppCheckEvents 
{
    public static void main(String[] args) throws Exception
    {
        // TODO: check that a JSON file is in the right format
        List<Event> events = Event.getEvents("data/myevents.json");
        System.out.println("Successfully found " + events.size() + " events");
            
    }
    
}
