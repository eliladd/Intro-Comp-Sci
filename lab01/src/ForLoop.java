public class ForLoop
{
    public static void main(String[] args) throws Exception
    {
        // These are variables! One is for the number of rows, 
        // and the other is for the number of columns.

        int numRows = 2;
        int numCols = 80;
        
        // This is a for loop! In fact it's two for loops that are nested.
        // There's a lot of syntax here, but we don't need to change very much of it
        // to create interesting effects.
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numCols; j++)
            {
                System.out.print("*");
            }
            //System.out.println();
        }
    }
}
