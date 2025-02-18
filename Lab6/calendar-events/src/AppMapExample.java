import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppMapExample 
{

    public static void main(String[] args) throws Exception
    {
        List<Event> events = Event.getEvents("data/duplicates.json");

        countDuplicates(events);
    }

    public static void countDuplicates(List<Event> events) throws Exception
    {
        Map<String, Integer> eventNames = new HashMap<>();
        for (Event event : events)
        {
            String name = event.getName();
            if (name != null)
            {
                if (eventNames.containsKey(name))
                {
                    eventNames.put(name, eventNames.get(name) + 1);
                }
                else
                {
                    eventNames.put(name, 1);
                }
            }
        }

        int maxDuplicates = 0;
        String eventName = "";
        for (String name : eventNames.keySet())
        {
            if (eventNames.get(name) > maxDuplicates)
            {
                maxDuplicates = eventNames.get(name);
                eventName = name;
            }
        }

        System.out.println("The event with the most duplicates is " + eventName + " with " + maxDuplicates + " duplicates");
    }
    
}
