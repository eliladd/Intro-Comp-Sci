import java.awt.Color;

public class StickFig
{
    public static void main(String[] args)
    {
        // TODO: Draw a stick figure.
        // A stick figure has a head, body, arms, and legs.
        // But, you can be creative. Extra arms? Great!
        // Two heads? Awesome.
        System.out.println("\n\nDraw a stick figure\n\n");

        // Your code here
        System.out.println("\n\nDraw a face\n\n");

        // Your code here:
        World world = new World(1920,1080);
        Turtle turtle = new Turtle(world);
        turtle.setPenColor(Color.BLACK);
        turtle.setPenWidth(10);
        //turtle.hide();
        //draw a circle for the outside of the face
        for (int k = 0; k < 20; k++){
            turtle.forward(50);
            // turn 18 degrees because 18 * 20 == 360 and 
            // this is a 20 sided polygon
            turtle.turn(18);
        }
        turtle.penUp();
        //draw the eyes
        turtle.moveTo(1000, 450);
        turtle.penDown();
        for (int k = 0; k < 20; k++){
            turtle.forward(5);
            // turn 18 degrees because 18 * 20 == 360 and 
            // this is a 20 sided polygon
            turtle.turn(18);
        }
        turtle.penUp();
        turtle.moveTo(1200, 450);
        turtle.penDown();
        for (int k = 0; k < 20; k++){
            turtle.forward(5);
            // turn 18 degrees because 18 * 20 == 360 and 
            // this is a 20 sided polygon
            turtle.turn(18);
        }
        //draw a nose
        turtle.penUp();
        turtle.moveTo(1075, 500);
        turtle.penDown();
        turtle.moveTo(1065, 510);
        turtle.moveTo(1070, 540);
        //turtle.moveTo(1075, 500);
        //draw a smile
        turtle.penUp();
        turtle.moveTo(1000, 580);
        turtle.turn(160);
        turtle.penDown();
        for(int i = 0;i<18;i++){
            turtle.turn(-7);
            turtle.forward(16);
        }
        //draw hair
        turtle.penUp();
        turtle.moveTo(1025, 390);
        turtle.penDown();
        turtle.moveTo(1045, 320);
        turtle.moveTo(1065, 310);
        turtle.moveTo(1105, 290);
        turtle.moveTo(1115, 300);
        turtle.moveTo(1155, 300);
        turtle.moveTo(1255, 420);
        //draw the body line and legs
        turtle.penUp();
        turtle.moveTo(1125, 680);
        turtle.penDown();
        turtle.moveTo(1125, 880);
        turtle.moveTo(1025, 980);
        turtle.penUp();
        turtle.moveTo(1125, 880);
        turtle.penDown();
        turtle.moveTo(1225, 980);
        //draw the arms
        turtle.penUp();
        turtle.moveTo(1025, 750);
        turtle.penDown();
        turtle.moveTo(1225, 750);
        
    }
    
}
