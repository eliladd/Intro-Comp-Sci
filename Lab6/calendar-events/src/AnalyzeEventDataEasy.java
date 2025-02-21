import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnalyzeEventDataEasy
{
    public static void main(String[] args) throws Exception
    {
        List<Event> events = Event.getEvents("data/events.json");

        //TODO: Uncomment method you want to call
        maxMinAverage(events);
        System.out.println("__________________________");
        maxMinAverageForSpisificSubSet(events, "Japan");
        System.out.println("__________________________");
        countSubmissions(events, "ekladd");
        countSubmissions(events, "mtahir");
        countSubmissions(events, "admin");
        System.out.println("__________________________");
        System.out.println("there are " + countUniqueEvents(events)+" unique events");
        System.out.println("__________________________");
        System.out.println("there are " + countEventsWithTag(events, "AI") + " events with the tag AI");
        System.out.println("there are " + countEventsWithTag(events, "Peace") + " events with the tag Peace");
        System.out.println("__________________________");
        mostCommonLoc(events);
        System.out.println("__________________________");

        //countBirthdays(events);
        
        //tagsContainsAI(events);
        
        //count1900s(events);
        
        //countEventsOnFriday(events);

        //tagsContains(events, "Literature");

        //mostCommonTag(events);
            
    }

    public static void countBirthdays(List<Event> events) throws Exception
    {
        // how many total events?
        int size = events.size();
        System.out.println(size);

        // ok, how many are birthdays?
        int numBirthdays = 0;
        // This is a variant of a for loop called
        // a "for each loop" or "enhanced for loop"
        for (Event event : events)
        {
            if (event.getType().equals("Birthday"))
            {
                numBirthdays++;
            }
        }

        System.out.println(numBirthdays);
    }

    public static void tagsContainsAI(List<Event> events) throws Exception
    {
        // how many total events?
        int size = events.size();
        System.out.println(size);

        // ok, how many have the tag "AI"?
        int numAI = 0;
        for (Event event : events)
        {
            if (event.getTags().contains("AI"))
            {
                System.out.println(event.getName());
                numAI++;
            }
        }

        System.out.println(numAI);
    }

    public static void tagsContains(List<Event> events, String word) throws Exception
    {
        // how many total events?
        int size = events.size();
        System.out.println(size);

        // ok, how many have the tag passed into this function?
        int num = 0;
        for (Event event : events)
        {
            if (event.getTags().contains(word))
            {
                System.out.println(event.getName());
                num++;
            }
        }

        System.out.println(num);
    }

    public static void count1900s(List<Event> events) throws Exception
    {
        // how many total events?
        int size = events.size();
        System.out.println(size);

        // ok, how many are in the 1900s?
        int num1900s = 0;
        for (Event event : events)
        {
            int year = event.getDate().getYear();
            if (year >= 1900 && year < 2000)
            {
                num1900s++;
            }
        }

        System.out.println(num1900s);
    }

    public static void countEventsOnFriday(List<Event> events) throws Exception
    {

        int numFriday = 0;
        for (Event event : events)
        {
            // DayOfWeek is an enum, so we can use == to compare
            // This is similar to Color.RED, Color.BLUE, etc. 
            // from the flagmaker lab
            if (event.getDate().getDayOfWeek() == DayOfWeek.FRIDAY)
            {
                numFriday++;
            }
        }
        System.out.println("total events: " + events.size());
        System.out.println("Num Friday: " + numFriday);
    }
    

    public static void mostCommonTag(List<Event> events) throws Exception
    {
        // create a map to store the count of each tag
        // a HashMap can "map" a key to a value
        // in this case it maps String => Integer
        // "Integer" is a reference version of "int"
        HashMap<String, Integer> tagCounts = new HashMap<>();
        for (Event event : events)
        {
            for (String tag : event.getTags())
            {
                // if we've never seen this tag before, add it to the map
                if (!tagCounts.containsKey(tag))
                {
                    tagCounts.put(tag, 0);
                }
                // increment the count for this tag
                tagCounts.put(tag, tagCounts.get(tag) + 1);
            }
        }

        // find the most common tag
        String mostCommonTag = null;
        int mostCommonTagCount = 0;
        for (String tag : tagCounts.keySet())
        {
            int count = tagCounts.get(tag);
            if (count > mostCommonTagCount)
            {
                mostCommonTag = tag;
                mostCommonTagCount = count;
            }
        }

        System.out.println("Most common tag: " + mostCommonTag);
        System.out.println("Count: " + mostCommonTagCount);
    }
    public static void maxMinAverage(List<Event> events) throws Exception
    {

        int min = 0;
        int max = 0;
        int numtotaltags = 0;
        double average = 0.0;
        for (Event event : events)
        {
            numtotaltags+= event.getTags().size();
            if (event.getTags().size()< min)
            {
                min = event.getTags().size();
            }
            if (event.getTags().size()> max)
            {
                max = event.getTags().size();
            }
        }
        average = numtotaltags/events.size();
        System.out.println("Smallest number of tags per event: " + min);
        System.out.println("Largest number of tags per event: " + max);
        System.out.println("Average number of tags per event: " + average);
    }
    public static void maxMinAverageForSpisificSubSet(List<Event> events, String subset) throws Exception
    {

        int min = events.get(0).getTags().size();
        int max = 0;
        int numtotaltags = 0;
        int numcorrectevents = 0;
        double average = 0;
        for (Event event : events){
            if( event.getTags().contains(subset)){
                numtotaltags+= event.getTags().size();
                numcorrectevents++;
                if (event.getTags().size()< min)
                {
                    min = event.getTags().size();
                }
                if (event.getTags().size()> max)
                {
                    max = event.getTags().size();
                }
            }
            //System.out.println(numtotaltags);
        }
        average = numtotaltags/numcorrectevents;
        System.out.println("Smallest number of tags per event of subset " + subset+": " + min);
        System.out.println("Largest number of tags per event of subset " + subset+": " + max);
        System.out.println("Average number of tags per event of subset " + subset+": " + average);
    }
    public static void countSubmissions(List<Event> events, String username) throws Exception{
        int num = 0;
        for (Event event : events){
            if( event.getUsername().contains(username)){
                num++;
            }
        }
        System.out.println(username + " has submitted " + num + " events");
    }
    public static int countUniqueEvents(List<Event> events) throws Exception{
        int num = 0;
        for (Event event : events){
            boolean isUnique = true;
            for (Event event2 : events){
                if(event.getName().equals(event2.getName()) && event != event2){
                    isUnique = false;
                }
            }
            if(isUnique){
                num++;
            }
        }
        return num;
    }
    //These are my 2 custom methods
    //count events with a spisific tag
    public static int countEventsWithTag(List<Event> events, String tag) throws Exception{
        int num = 0;
        for (Event event : events){
            if(event.getTags().contains(tag)){
                num++;
            }
        }
        return num;
    }
    //Find the top 3 most common locations without using a hashmap
    public static void mostCommonLoc(List<Event> events) throws Exception{
        String currentLoc = "";
        String mostCommonLoc = "";
        int currentCount = 0;
        int mostCommonCount = 0;
        for (Event event : events){
            currentLoc = event.getLocation();
            for (Event event2 : events){
                if(currentLoc == event2.getLocation()){
                    currentCount++;
                }
            }
            if(currentCount > mostCommonCount){
                mostCommonLoc = currentLoc;
                mostCommonCount = currentCount;
                currentCount = 0;
            }
        }
        System.out.println("the most common location is " + mostCommonLoc + " with " + mostCommonCount + " occurences");
    }
    

}
