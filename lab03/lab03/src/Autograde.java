import cder.flags.Autograder;

public class Autograde 
{
    public static void main(String[] args) throws Exception
    {
        Autograder ag = new Autograder();

        String flagFunctionsClass = "Lab03FlagMaker";
        
        ag.testFlags2(flagFunctionsClass);
    }
    
}
