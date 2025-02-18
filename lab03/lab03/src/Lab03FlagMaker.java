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
        for (int r=0; r<(grid.getNumRows()/5)*2; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.PINK);
            }
        }
        for (int r=(grid.getNumRows()/5)*2; r<(grid.getNumRows()/5)*3; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.MAGENTA);
            }
        }
        for (int r=(grid.getNumRows()/5)*3; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
    }


    @Flag(name="Comoros", num=11)
    public static void drawComorosFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows()/4; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        for (int r=(grid.getNumRows()/4)*2; r<(grid.getNumRows()/4)*3; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        for (int r=(grid.getNumRows()/4)*3; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.BLUE);
            }
        }
        //draw a triangle that goes to the middle
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                if(r*2 == c&& r < grid.getNumRows()/2||r*2>c&& r < grid.getNumRows()/2)
                {
                    grid.setColor(r, c, Color.GREEN);
                    grid.setColor(r, c+1, Color.GREEN);
                
                }
            }
        }
        int NUM =0;
        for (int row=grid.getNumRows()/2; row<grid.getNumRows();row++){
            for (int c= 0; c<(row*2)-(NUM*2);c++){
                grid.setColor(row, c, Color.GREEN);
            }
            NUM+=2;
        }
    }


    @Flag(name="CzechRepublic", num=12)
    public static void drawCzechRepublicFlag(IDrawGrid grid)
    {
        for (int r=grid.getNumRows()/2; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        //draw a triangle that goes to the middle
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                if(r*2 == c&& r < grid.getNumRows()/2||r*2>c&& r < grid.getNumRows()/2)
                {
                    grid.setColor(r, c, Color.BLUE);
                    grid.setColor(r, c+1, Color.BLUE);
                
                }
            }
        }
        int NUM =0;
        for (int row=grid.getNumRows()/2; row<grid.getNumRows();row++){
            for (int c= 0; c<(row*2)-(NUM*2);c++){
                grid.setColor(row, c, Color.BLUE);
            }
            NUM+=2;
        }
    }


    @Flag(name="Antigua", num=13)
    public static void drawAntiguaFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows()/3;r++){
            for (int c=0; c<grid.getNumCols();c++){
                grid.setColor(r, c, Color.BLACK);
            }
        }
        
        for (int r=grid.getNumRows()/3; r<(grid.getNumRows()/3)*2;r++){
            for (int c=0; c<grid.getNumCols();c++){
                grid.setColor(r, c, Color.BLUE);    
            }
        }

        for (int r=0; r<grid.getNumRows();r++){
            for (int c= 0; c<((r+1));c++){
                grid.setColor(r, c, Color.RED);
            }
        }
        for (int r=0; r<grid.getNumRows();r++){
            for (int c= 0; c<(r+1);c++){
                grid.setColor(r, grid.getNumCols()-1-c, Color.RED);
                
            }
        }
    }


    @Flag(name="Bangladesh", num=14)
    public static void drawBangladeshFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows();r++){
            for (int c=0; c<grid.getNumCols();c++){
                grid.setColor(r, c, Color.GREEN);
            }
        }
        for (int r=grid.getNumRows()/3; r<(grid.getNumRows()/3)*2;r++){
            for (int c=grid.getNumCols()/3; c<(grid.getNumCols()/3)*2;c++){
                grid.setColor(r, c, Color.RED);
            }
        }
    }


    @Flag(name="Macedonia", num=15)
    public static void drawMacedoniaFlag(IDrawGrid grid)
    {
        //blue background
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.RED);
            }
        }
        
        //yellow cross
        for (int r=0; r<grid.getNumRows(); r++)
        {
            for (int c=(grid.getNumCols()/2)-1; c<(grid.getNumCols()/2)+1; c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        for (int r=grid.getNumRows()/2-1; r<grid.getNumRows()/2+1; r++)
        {
            for (int c=0; c<grid.getNumCols(); c++)
            {
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        //yellow cross
        for (int r=0; r<grid.getNumRows(); r++){
            for (int c=0; c<grid.getNumCols(); c++){
                if(r*2 == c){
                    grid.setColor(r, c, Color.YELLOW);
                    grid.setColor(r, c+1, Color.YELLOW);
                }
            }
        }
        //draw a black cross from the top right to the bottom left
        int offset = 0;
        for (int r=grid.getNumRows()-1; r>=0;r--){
            int c=offset;
            grid.setColor(r, c, Color.YELLOW);
            grid.setColor(r, c+1, Color.YELLOW);
            offset+=2; 
        }
        
    }


    @Flag(name="Guyana", num=16)
    public static void drawGuyanaFlag(IDrawGrid grid)
    {
        for (int r=0; r<grid.getNumRows();r++){
            for (int c=0; c<grid.getNumCols();c++){
                grid.setColor(r, c, Color.GREEN);
            }
        }
        //yellow triangle
        for (int r=0; r<grid.getNumRows()/2;r++){
            for (int c= 0; c<((r+1)*4);c++){
                grid.setColor(r, c, Color.YELLOW);
            }
        }
        int NUM =0;
        for (int r=grid.getNumRows()/2; r<grid.getNumRows();r++){
            for (int c= 0; c<(r*4)-(NUM*4);c++){
                grid.setColor(r, c, Color.YELLOW);
            }
            NUM+=2;
        }
        //black lines
        NUM = 0;
        for (int r =0; r<grid.getNumRows();r++){
            if (r<grid.getNumRows()/2){
                int c= r+1;
                grid.setColor(r, c, Color.BLACK);
            }
            else{
                int c = r-NUM;
                grid.setColor(r, c, Color.BLACK);
                NUM+=2;
            }
        }
        //red triangle
        for (int r=0; r<grid.getNumRows()/2;r++){
            for (int c= 0; c<((r+1));c++){
                grid.setColor(r, c, Color.RED);
            }
        }
        NUM =0;
        for (int r=grid.getNumRows()/2; r<grid.getNumRows();r++){
            for (int c= 0; c<r-NUM;c++){
                grid.setColor(r, c, Color.RED);
            }
            NUM+=2;
        }
        
    }    
}
