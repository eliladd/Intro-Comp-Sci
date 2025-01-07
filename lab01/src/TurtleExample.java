import java.awt.Color;

public class TurtleExample 
{

    public static void main(String[] args)
    {
        World world = new World();
        Turtle turtle = new Turtle(world);
        turtle.setColor(Color.RED);

        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);

        turtle.setColor(Color.BLUE);

        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);

    }
    
}
