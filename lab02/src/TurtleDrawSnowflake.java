import java.util.*;
import java.awt.*;

public class TurtleDrawSnowflake
{
  public static void main(String[] args)
  {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);
      yertle.setColor(Color.blue);

      for (int i = 1; i <= 12; i++) {

         // inner loop draws a square
         for(int sides = 1; sides <= 4; sides++) {
             yertle.forward();
             yertle.turn(90);
         }
         // turn a little before drawing square again
         yertle.turn(30);
      }
      world.show(true);
  }
}

