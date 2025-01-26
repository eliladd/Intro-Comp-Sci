import java.awt.Color;

/**
 * class Spiral; another example for you
 * 
 * You can try out differen things here
 * 
 */
public class Spiral 
{
    public static void cornerSquare(Turtle turtle, int side)
    {
        // this function draws a square of the given side length
        // centered around the turtles current location

        // this moves the turtle s/2 left and s/2 down
        turtle.penUp();
        turtle.turn(-90);
        turtle.forward(side / 2);
        turtle.turn(90);
        turtle.backward(side / 2);
        turtle.penDown();

        square(turtle, side);

        // this moves the turtle back to the middle where we started
        turtle.penUp();
        turtle.forward(side / 2);
        turtle.turn(90);
        turtle.forward(side / 2);
        turtle.turn(-90);

    }
    public static void square(Turtle turtle, int side)
    {
        // draw a square of the given side length
        // the current location of the turtle will
        // be the bottom left corner of the square
        for (int i = 0; i < 4; i++)
        {
            turtle.forward(side);
            turtle.turn(90);
        }
    }

    public static void main(String[] args)
    {
        World world = new World(800, 800);
        Turtle turtle = new Turtle(world);

        turtle.setPenColor(Color.BLACK);

        for (int i = 0; i < 20; i++)
        {
            square(turtle, 50);
            turtle.turn(18);
        }
    }

    public static void drawSpiral(Turtle turtle, int side1, int side2, int numSides)
    {
        for (int i = 0; i < numSides; i++)
        {
            turtle.forward(side1);
            turtle.turn(90);
            turtle.forward(side2);
            turtle.turn(90);
            side1 += 10;
            side2 += 10;
        }
    }
    
}
