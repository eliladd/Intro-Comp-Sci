import greenfoot.*;

public class Krieger extends Actor
{

    /**
     * Act - do whatever the kriegerSplat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.delay(5);
        getWorld().removeObjects(getWorld().getObjects(Krieger.class));
    }    
}

