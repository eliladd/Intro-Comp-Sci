import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int speed = 6;
    int step = 1;
    boolean add = true;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        setImage("images/rocket.png");
        setRotation(-90);
    }
    public void act()
    {
        MyWorld world = (MyWorld)getWorld();
        if(step >50){
            setImage("images/rocket.png");
        }
        else{
            setImage("images/rocket2.png");
        }
        if(step == 100){
            add = false;
        }
        if(step ==0){
            add = true;
        }
        if(add){
            step++;
        }
        else{
            step--;
        }
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
        }
        if ("space".equals(Greenfoot.getKey())||"up".equals(Greenfoot.getKey()))
    {
        fire();
    }
    }
    public void fire()
    {
        Projectile pew = new Projectile();
        getWorld().addObject(pew, getX(), getY());
        pew.setRotation(getRotation());
        pew.move(40);
    }
}
