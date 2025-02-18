import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Octorok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Octorok extends Actor
{    
    
    /**
     * Act - do whatever the Octorok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // can only be called AFTER added to the world
        MyWorld world = (MyWorld)getWorld();
        Player player = world.getPlayer();
        int playerX = player.getX();
        int playerY = player.getY();
        // turn to face the player
        turnTowards(playerX, playerY);
        move(1);
        
        if (isTouching(Player.class))
        {
            world.setDialogMessage("I hit you!");
        }
    }
}
