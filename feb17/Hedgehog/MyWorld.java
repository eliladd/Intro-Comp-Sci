import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    hedgehog hh = new hedgehog();
    balloon ba = new balloon();
    balloon ba2 = new balloon();
    pizza pi1 = new pizza();
    pizza pi2 = new pizza();
    pizza pi3 = new pizza();
    pizza pi4 = new pizza();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(hh, 300, 200);
        addObject(ba, 100, 200);
        addObject(ba2, 50, 200);
        addObject(pi1,150,50);
        addObject(pi2,450,50);
        addObject(pi3,450,350);
        addObject(pi4,150,350);
    }
}
