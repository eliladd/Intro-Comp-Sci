import cder.flags.AppFlagMaker;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Starting!\n\nlocal folder is " + new java.io.File(".").getCanonicalPath());
        AppFlagMaker.start(args);
    }
    
}
