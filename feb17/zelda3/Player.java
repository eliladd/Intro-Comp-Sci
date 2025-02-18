import greenfoot.*;

public class Player extends Actor
{
    // how fast should the player move
    int speed = 6;
    
    // these are the images for animation
    private GreenfootImage[] leftImages;
    private GreenfootImage[] rightImages;
    private GreenfootImage[] upImages;
    private GreenfootImage[] downImages;
    
    // To alternate between images
    private int frame = 0;  
    
    // To control the speed of animation
    private int animationCounter = 0;
    
    // Adjust this to make the animation slower or faster
    private int animationSpeed = 8;

    public Player()
    {
        String path = "images/player/";
        // Load images for left movement
        leftImages = new GreenfootImage[2];
        leftImages[0] = new GreenfootImage(path + "left1.png");
        leftImages[1] = new GreenfootImage(path + "left2.png");
        
        // Load images for right movement
        rightImages = new GreenfootImage[2];
        rightImages[0] = new GreenfootImage(path + "right1.png");
        rightImages[1] = new GreenfootImage(path + "right2.png");
        
        // Load images for up movement
        upImages = new GreenfootImage[2];
        upImages[0] = new GreenfootImage(path + "up1.png");
        upImages[1] = new GreenfootImage(path + "up2.png");
        
        // Load images for down movement
        downImages = new GreenfootImage[2];
        downImages[0] = new GreenfootImage(path + "down1.png");
        downImages[1] = new GreenfootImage(path + "down2.png");

        // Set the initial image (optional)
        setImage(downImages[0]);
    }
    
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        
        // Simple movement controls
        // either arrow keys or WASD
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            if (getX() - speed <= 0)
            {
                // if we go over the left edge of the screen
                // set us to the left edge
                setLocation(0, getY());
            }
            else
            {
                // otherwise just move us
                setLocation(getX() - speed, getY());
            }
            // animate our avatar
            animateMovement(leftImages);
            
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            if (getX() + speed > world.getWidth() - 1)
            {
                // if we go over the right edge, set us at the right edge
                setLocation(world.getWidth() - 1, getY());
            }
            else
            {
                setLocation(getX() + speed, getY());
            }
            animateMovement(rightImages);
        }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) 
        {
            if (getY() - speed < 0)
            {
                // if we go over the top edge, set us at the top edge
                setLocation(getX(), 0);
            }
            else
            {
                setLocation(getX(), getY() - speed);
            }
            animateMovement(upImages);
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) 
        {
            if (getY() + speed > world.getHeight() - 1)
            {
                // if we go over the bottom edge, set us at the bottom
                setLocation(getX(), world.getHeight() - 1);
            }
            else
            {
                setLocation(getX(), getY() + speed);
            }
            animateMovement(downImages);
        }
        
        // Check if the avatar is at the edge of the world and switch screens
        // if we reach the edge of the world (i.e. there are no new screens)
        // this method will "pin" us where we are
        checkForScreenChange();
    }
    
    private void animateMovement(GreenfootImage[] images)
    {
        // Increase the animation counter
        // this just keeps increasing by a bunch
        animationCounter++;
        
        // Switch images every few frames (controlled by animationSpeed)
        if (animationCounter % animationSpeed == 0)
        {
            // Alternate between 0 and 1, since we have 2 frames in each direction
            // such as down1.png and down2.png
            frame = (frame + 1) % images.length;
            
            // Set the current frame's image
            setImage(images[frame]);
        }
    }
    
    private void checkForScreenChange()
    {
        // Get a reference to the world
        // this is a built-in Greenfoot method
        MyWorld world = (MyWorld)getWorld();
        int currentRow = world.getCurrentRow();
        int currentCol = world.getCurrentCol();
        int numRows = world.getNumRows();
        int numCols = world.getNumCols();
        
        
        // Check if the avatar is NOT at the left edge
        if (getX() <= 0 && currentCol > 0)
        {
            // switch to the screen to the left
            world.changeScreen(0, -1); 
            // "wrap around" from the left edge to the right edge of the screen
            setLocation(world.getWidth() - 2, getY());
        }
        else if (getX() >= world.getWidth() - 1 && currentCol < numCols - 1)
        {
            // Check if the avatar is at the right edge
            world.changeScreen(0, 1);
            setLocation(1, getY());
        }
        else if (getY() <= 0 && currentRow > 0)
        {
            // Check if the avatar is at the top edge
            world.changeScreen(-1, 0);
            setLocation(getX(), world.getHeight() - 2);
        }
        else if (getY() >= world.getHeight() - 1 && currentRow < numRows - 1)
        {
            // Check if the avatar is at the bottom edge
            world.changeScreen(1, 0);
            setLocation(getX(), 1);
        }
    }
}
