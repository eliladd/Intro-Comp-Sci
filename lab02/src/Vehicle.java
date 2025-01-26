import java.awt.Color;
import java.util.Random;
public class Vehicle
{
    public static void main(String[] args)
    {
        // TODO: Draw a vechicle.
        // It can be a car, truck, bus, bike, spaceship, Tardis, etc.
        // Be creative!
        System.out.println("\n\nDraw a vehicle\n\n");
        Random rand = new Random();
        // your code here:
        World world = new World(600,1080);
        Turtle turtle = new Turtle(world);
        turtle.setPenColor(Color.BLACK);
        turtle.setPenWidth(3);
        turtle.penUp();
        turtle.hide();
        //draw the main body
        turtle.moveTo(200, 800);
        turtle.penDown();
        turtle.moveTo(200, 300);
        turtle.moveTo(400, 300);
        turtle.moveTo(400, 800);
        turtle.moveTo(200, 800);
        //draw the top of the rocket
        turtle.moveTo(200, 300);
        turtle.moveTo(300, 100);
        turtle.moveTo(400, 300);
        //draw the window on the top
        turtle.penUp();
        turtle.moveTo(270, 250);
        turtle.penDown();
        for (int k = 0; k < 20; k++){
            turtle.forward(10);
            // turn 18 degrees because 18 * 20 == 360 and 
            // this is a 20 sided polygon
            turtle.turn(18);
        }
        //draw the fins
        //right
        turtle.penUp();
        turtle.moveTo(400, 800);
        turtle.penDown();
        turtle.moveTo(500, 800);
        turtle.moveTo(400, 600);
        //left
        turtle.penUp();
        turtle.moveTo(200, 800);
        turtle.penDown();
        turtle.moveTo(100, 800);
        turtle.moveTo(200, 600);
        //draw the nozzle
        turtle.penUp();
        turtle.moveTo(250, 800);
        turtle.penDown();
        turtle.moveTo(220, 900);
        turtle.moveTo(380, 900);
        turtle.moveTo(360, 800);
        turtle.penUp();
        //draw the flames
        int randloc;
        int randsize;
        int min = -100; // Minimum value (inclusive)
        int max = 100;  // Maximum value (inclusive)
        int mina = 0; // Minimum value (inclusive)
        int maxa = 10;  // Maximum value (inclusive)

        for(int x = 0; x < 100; x++){
            //float r = rand.nextFloat();
            //float g = rand.nextFloat() / 3f;
            //float b = rand.nextFloat() / 3f;
            int randr = (int)(Math.random()*256);
            int randg = (int)(Math.random()*256/3);
            int randb = (int)(Math.random()*256/3);
            Color randomColor = new Color(randr, randg, randb);
             randloc = rand.nextInt(max - min + 1) + min;
             randsize = rand.nextInt(maxa - mina + 1) + mina;
             turtle.setPenColor(randomColor);
             turtle.setPenWidth(randsize);
             turtle.penUp();
            turtle.moveTo(300+(randloc/2), 900);
            turtle.penDown();
            turtle.moveTo(300+randloc, 1000);
            
        }
    }
}
