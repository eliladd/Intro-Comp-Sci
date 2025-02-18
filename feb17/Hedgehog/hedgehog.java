import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hedgehog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hedgehog extends Actor
{
    
    private int speed = 2;
    private int Lives = 3;
    private int Points = 0;
    
    // public hedgehog()
    // {
        // speed = 2;
        // Lives = 3;
    // }
    
    public void act() 
    {
        moveWithKeys();
        showStatus();
        hitPizza();
        hitBalloon();
        testEndGame();
        testWinGame();
    }    
    
    public void moveWithKeys()
    {
        if (Greenfoot.isKeyDown("right") )
        {
            setLocation(getX()+speed, getY() );
        }
        if (Greenfoot.isKeyDown("Left") )
        {
            setLocation(getX()-speed, getY() );
        }
        if (Greenfoot.isKeyDown("Up") )
        {
            setLocation(getX(), getY()-speed );
        }
        if (Greenfoot.isKeyDown("Down") )
        {
            setLocation(getX(), getY()+speed );
        }
}

public void showStatus()
{
    getWorld().showText("Lives"+Lives,50,30);
    getWorld().showText("Points"+Points,50,10);
}

public void addPoints()
{
    Points = Points + 1;
}

public void loseLife()
{
    Lives = Lives - 1;
}

public void hitPizza()
{
    if (isTouching (pizza.class) )
    {
        removeTouching (pizza.class);
        addPoints();
    }
}

public void hitBalloon()
{
    if (isTouching (balloon.class) )
    {
        setLocation(300,100);
        loseLife();
    }
}

public void testEndGame()
 {
        if (Lives<1)
        {
            getWorld().showText("YOU LOSE",300,200);
        }
 }
 
 public void testWinGame()
 {
        if (Points>3)
        {
            getWorld().showText("YOU WIN",300,150);
        }
 }
}
