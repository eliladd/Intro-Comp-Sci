import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dialog extends Actor
{
    private GreenfootImage dialogImage;  // To hold the dialog box background
    private int width;
    private int height;
    // courier font, yes bold, no italic, 20 point size
    private Font font = new Font("Courier", true, false, 30);
    private boolean visible = false;
    
    public boolean isVisible() {
        return visible;
    }
    
    public void toggleVisibility() {
        visible = !visible;
    }
    
    public Dialog(int width, int height, String text)
    {
        this.width = width;
        this.height = height;
        
        // Create the background for the dialog box
        dialogImage = new GreenfootImage(width, height);
        dialogImage.setColor(Color.BLACK);  // Background color for the dialog
        dialogImage.fillRect(0, 0, width, height);
        dialogImage.setColor(Color.WHITE);  // Text color
        dialogImage.drawRect(1, 1, width - 1, height - 1);  // Add a border
        dialogImage.setFont(font);
        
        // Set the dialog text
        setText(text);
        
        // Set the image for this actor (which is the dialog box)
        setImage(dialogImage);
    }
    
    // Method to update the dialog text
    public void setText(String text)
    {
        dialogImage.clear();
        
        // Redraw the dialog box
        dialogImage.setColor(Color.BLACK);
        dialogImage.fillRect(0, 0, width, height);
        dialogImage.setColor(Color.WHITE);
        dialogImage.drawRect(0, 0, width - 1, height - 1);
        
        // Draw the text onto the dialog box
        dialogImage.setColor(Color.WHITE);
        
        dialogImage.drawString(text, 10, height / 2);  // Adjust x, y for padding
    }
    
    
}
