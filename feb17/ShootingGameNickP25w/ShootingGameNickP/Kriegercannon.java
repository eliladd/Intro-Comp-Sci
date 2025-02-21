import greenfoot.*;

public class Kriegercannon extends Actor
{
    private int butterfliesShot;
    private int life = Greenfoot.getRandomNumber(10) + 10;
    /**
     * Act - do whatever the Kriegercannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        splatter();
    }    
    public void splatter()
    {
        if (isTouching(Bird.class))
        {
            Krieger krieger = new Krieger();
            getWorld().addObject(krieger, getX(), getY());
            removeTouching(Bird.class);
            butterfliesShot = butterfliesShot + 1;
            if (butterfliesShot == 10)
            {
                Greenfoot.stop();
            }
        }
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }

}
