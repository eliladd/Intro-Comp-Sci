import greenfoot.*;

/**
 * Write a description of class Cannon here.
 * 
 * @author (Nick Peroni) 
 * @version (1)
 */
public class Cannon extends Actor
{
    
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if (Greenfoot.isKeyDown("left"))
       {
           setRotation (getRotation() - 5);
    }
    if (Greenfoot.isKeyDown("right"))
       {
           setRotation (getRotation() + 5);
    }
    if ("space".equals(Greenfoot.getKey()))
    {
        fire();
    }
}
/**
 * Fire the cannon.
 */
    public void fire()
    {
        Kriegercannon kriegercannon = new Kriegercannon();
        getWorld().addObject(kriegercannon, getX(), getY());
        kriegercannon.setRotation(getRotation());
        kriegercannon.move(40);
    }
    
}