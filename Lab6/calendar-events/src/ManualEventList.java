import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManualEventList 
{
    public static void main(String[] args) throws Exception
    {
        List<Event> events = new ArrayList<>();
        Event e = new Event("Birthday of Alan Turing",
            "Alan Turing was a British mathematician, logician, cryptanalyst, and computer scientist.",
            "Birthday",
            "-0480-06-23",
            "London, United Kingdom",
            "Turing", "Mathematics", "Computer Science", "AI");
        
        events.add(e);
        System.out.println(e.getDate().getYear());
        
    }
    
}
