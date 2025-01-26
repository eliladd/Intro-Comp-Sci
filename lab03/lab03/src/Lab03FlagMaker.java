import cder.flags.Flag;
import cder.flags.IDrawGrid;
import javafx.scene.paint.Color;

public class Lab03FlagMaker 
{
    @Flag(name="Poland", num=1)
    public static void drawPolandFlag(IDrawGrid grid)
    {
        for (int r = grid.getNumRows()/2; r < grid.getNumRows(); r++)
        {
            for (int c = 0; c < grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
    }

    @Flag(name="Ukraine", num=2)
    public static void drawUkraineFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows()/2; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
        for (int r=grid.getNumRows()/2; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
    }


    @Flag(name="Angola", num=3)
    public static void drawAngolaFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows()/2; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        for (int r=grid.getNumRows()/2; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLACK);
            }
        }
    }


    @Flag(name="Bolivia", num=4)
    public static void drawBoliviaFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows()/3; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        for (int r=grid.getNumRows()/3; r<(grid.getNumRows()/3)*2; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        for (int r=(grid.getNumRows()/3)*2; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
        }
    }


    @Flag(name="Ireland", num=5)
    public static void drawIrelandFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols()/3; c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
        }
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=(grid.getNumCols()/3)*2; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.ORANGE);
            }
        }
    }


    @Flag(name="Montenegro", num=6)
    public static void drawMontenegroFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        for (int r=1; r<grid.getNumRows()-1; r++)
        {
            for (int c=1; c<grid.getNumCols()-1; c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        for (int r=grid.getNumRows()/3; r<(grid.getNumRows()/3)*2; r++)
        {
            for (int c=grid.getNumCols()/3; c<(grid.getNumCols()/3)*2; c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
    }


    @Flag(name="Rwanda", num=7)
    public static void drawRwandaFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows()/2; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
        for (int r=grid.getNumRows()/2; r<(grid.getNumRows()/4)*3; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        for (int r=(grid.getNumRows()/4)*3; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.GREEN);
            }
        }
    }


    @Flag(name="DominicanRepublic", num=8)
    public static void drawDominicanRepublicFlag(IDrawGrid grid)
    {
        //blue background
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
        
        //red squares
        for (int r=0; r<grid.getNumRows()/2; r++)
        {
            for (int c=grid.getNumCols()/2; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        for (int r=grid.getNumRows()/2; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols()/2; c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        //white cross
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=(grid.getNumCols()/2)-2; c<(grid.getNumCols()/2)+2; c++)
            {
                grid.setColor(r, c, Color.WHITE);
            }
        }
        for (int r=grid.getNumRows()/2-2; r<grid.getNumRows()/2+2; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.WHITE);
            }
        }
            
    }


    @Flag(name="Rainbow", num=9)
    public static void drawRainbowFlag(IDrawGrid grid)
    {
        int num = 0;
        while(num < 6){
            switch(num){
                case 0:
                for (int r=0; r<grid.getNumRows(); r++)
                {
                    for (int c=0; c<grid.getNumCols()/6; c++)
                    {
                        grid.setColor(r, c, Color.RED);
                    }
                }
                case 1:
                for (int r=0; r<grid.getNumRows(); r++)
                {
                    for (int c=grid.getNumCols()/6; c<(grid.getNumCols()/6)*2; c++)
                    {
                        grid.setColor(r, c, Color.ORANGE);
                    }
                }
                case 2:
                for (int r=0; r<grid.getNumRows(); r++)
                {
                    for (int c=(grid.getNumCols()/6)*2; c<(grid.getNumCols()/6)*3; c++)
                    {
                        grid.setColor(r, c, Color.YELLOW);
                    }
                }
                case 3:
                for (int r=0; r<grid.getNumRows(); r++)
                {
                    for (int c=(grid.getNumCols()/6)*3; c<(grid.getNumCols()/6)*4; c++)
                    {
                        grid.setColor(r, c, Color.GREEN);
                    }
                }
                case 4:
                for (int r=0; r<grid.getNumRows(); r++)
                {
                    for (int c=(grid.getNumCols()/6)*4; c<(grid.getNumCols()/6)*5; c++)
                    {
                        grid.setColor(r, c, Color.BLUE);
                    }
                }
                case 5:
                for (int r=0; r<grid.getNumRows(); r++)
                {
                    for (int c=(grid.getNumCols()/6)*5; c<grid.getNumCols(); c++)
                    {
                        grid.setColor(r, c, Color.PINK);
                    }
                }
            }
            num++;
        }
    }


    @Flag(name="Bisexual", num=10)
    public static void drawBisexualFlag(IDrawGrid grid)
    {
        // your code here
    }


    @Flag(name="Comoros", num=11)
    public static void drawComorosFlag(IDrawGrid grid)
    {
        // your code here
    }


    @Flag(name="CzechRepublic", num=12)
    public static void drawCzechRepublicFlag(IDrawGrid grid)
    {
        // your code here
    }


    @Flag(name="Antigua", num=13)
    public static void drawAntiguaFlag(IDrawGrid grid)
    {
        // your code here
    }


    @Flag(name="Bangladesh", num=14)
    public static void drawBangladeshFlag(IDrawGrid grid)
    {
        // your code here
    }


    @Flag(name="Macedonia", num=15)
    public static void drawMacedoniaFlag(IDrawGrid grid)
    {
        // your code here
    }


    @Flag(name="Guyana", num=16)
    public static void drawGuyanaFlag(IDrawGrid grid)
    {
        // your code here
    }    
}
