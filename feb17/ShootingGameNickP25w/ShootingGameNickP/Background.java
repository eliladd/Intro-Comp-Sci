import greenfoot.*;

/**
 * Write a description of class Background here.
 * 
 * @author (Nick Peroni) 
 * @version (Version 1)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 388, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Cannon cannon = new Cannon();
        addObject(cannon, 63, 327);
        
        
        
        Bird bird = new Bird();
        addObject(bird, 528, 137);
        Bird bird2 = new Bird();
        addObject(bird2, 579, 282);
        Bird bird3 = new Bird();
        addObject(bird3, 412, 119);
        Bird bird4 = new Bird();
        addObject(bird4, 332, 197);
        Bird bird5 = new Bird();
        addObject(bird5, 453, 218);
        Bird bird6 = new Bird();
        addObject(bird6, 298, 295);
        Bird bird7 = new Bird();
        addObject(bird7, 443, 306);
        Bird bird8 = new Bird();
        addObject(bird8, 566, 212);
        Bird bird9 = new Bird();
        addObject(bird9, 511, 339);
        Bird bird10 = new Bird();
        addObject(bird10, 389, 354);
        Bird bird11 = new Bird();
        addObject(bird11, 272, 357);
        Bird bird12 = new Bird();
        addObject(bird12, 589, 367);
        Bird bird13 = new Bird();
        addObject(bird13, 374, 259);
        Bird bird14 = new Bird();
        addObject(bird14, 247, 208);
        Bird bird15 = new Bird();
        addObject(bird15, 315, 138);
    }
}
