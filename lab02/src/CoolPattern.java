
import java.awt.Color;

/**
 * 
 * An example of an interesting pattern.
 * 
 * You can experiment with this class to get different patterns
 * 
 */
public class CoolPattern
{
    
    public static void main(String[] args)
    {
        World world = new World(1920,1080);
        Turtle turt = new Turtle(world);
        turt.hide();
        turt.moveTo(800, 100);
        turt.setPenColor(Color.BLUE);
        turt.setPenWidth(4);
        
        int side1 = 100;
        int side2 = 30;
        turt.turn(45);   
        for(int k = 0; k <4;k++){
            for (int i=0; i<10; i++) {
                turt.forward(side1);
                turt.turn(45);
                turt.forward(side2);
                turt.turn(135);
                turt.forward(side1);
                turt.turn(45);
                turt.forward(side2);
                turt.backward(side2);
                turt.turn(135);
            }
            turt.turn(90);
        }     
    }
}
