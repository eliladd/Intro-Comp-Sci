import java.awt.Color;
/**
 * Example of how to draw a cirlce using a turtle
 * 
 * basically, we draw a 20-sided polygon
 * 
 * DO NOT TRY TO DRAW 360 segments of length 1 with a 1 degree turn. 
 * This will not work because of the way the turtle moves.
 */
public class Circle
{

    public static void main(String[] args)
    {
        World world = new World(1920,1080);
        Turtle turtle = new Turtle(world);

        // Pick a color
        turtle.setPenColor(Color.BLACK);
        
        // Remember that you can't draw circles directly
        // This is a 20 sided polygon with sides of length 50
        for(int i = 0; i < 24; i++){
            for (int k = 0; k < 20; k++){
                turtle.forward(50);
                // turn 18 degrees because 18 * 20 == 360 and 
                // this is a 20 sided polygon
                turtle.turn(18);
            }
            turtle.penUp();
            turtle.turn(15);
            turtle.penDown();

        }
        
    }
    
}