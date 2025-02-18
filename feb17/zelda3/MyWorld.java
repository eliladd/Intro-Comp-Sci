import greenfoot.*;
import java.util.List;

public class MyWorld extends World
{
    // 2D array of backgrounds
    private GreenfootImage[][] screens;  
    
    private int numRows = 8;
    private int numCols = 16;
    // in Zelda, Link starts at row 7, col 7, 
    // which is about the middle of the bottom
    private int currentRow = 7;  
    private int currentCol = 7;  
    
    private Player player = new Player();
    
    // Dialog window
    private Dialog dialog;
    
    
    public MyWorld()
    {    
        // constructs a new world
        // this calls the constructor from World that MyWorld inherits
        // You don't need to worry about these details too much
        super(256*4, 176*4, 1, true);  
        
        dialog = new Dialog(300, 300, "");
        
        screens = new GreenfootImage[numRows][numCols];
        // 8 rows, 16 cols
        // Initialize the 2D array of backgrounds
        for (int r=0; r<numRows; r++) {
            for (int c=0; c<numCols; c++) {
                String file = "chunk_" + r + "_" + c + ".png";
                screens[r][c] = new GreenfootImage("images/backgrounds/" + file);
            }
        }

        // Set the initial background
        setBackground(screens[currentRow][currentCol]);
        
        // Add the player to the world
        // Start in the middle of the screen
        addObject(player, getWidth() / 2, getHeight() / 2);  
    }
    
    public void spawnEnemies()
    {
        // where is the player? Don't spawn enemies right on top of the player
        int playerX = player.getX();
        int playerY = player.getY();
        
        int worldWidth = getWidth();
        int worldHeight = getHeight();
        
        int jitter = 30;
        
        // spawn 3 random enemies
        for (int i=0; i<3; i++)
        {
            // put them randomly along the middle of the screen
            int enemyY = worldHeight / 2 + Greenfoot.getRandomNumber(jitter) - jitter/2;
            int enemyX = Greenfoot.getRandomNumber(worldWidth);
            
            Octorok octorok = new Octorok();
            addObject(octorok, enemyX, enemyY);
        }
        
    }
    
    // Method to change the screen when the player reaches the edge
    public void changeScreen(int deltaRow, int deltaCol)
    {
        // these 4 ifs make sure we don't go over any of the edges
        if (currentRow + deltaRow < 0) return;
        if (currentRow + deltaRow > numRows - 1) return;
        if (currentCol + deltaCol < 0) return;
        if (currentCol + deltaCol > numCols - 1) return;
        
        // add the change in row and column
        currentRow += deltaRow;
        currentCol += deltaCol;
        
        // remove all enemies
        List<Octorok> enemies = getObjects(Octorok.class);
        removeObjects(enemies);
        
        // Set the new background based on the updated position
        setBackground(screens[currentRow][currentCol]);
    }
    
    public void setDialogMessage(String message)
    {
        // Add the dialog window
        addObject(dialog, 300, 300);
        // set the text to be displayed
        dialog.setText(message);
    }
    
    public void removeDialogMessage()
    {
        // remove the dialog window
        removeObject(dialog);
    }
    
    public void act()
    {
        String k = Greenfoot.getKey();
        if ("space".equals(k))
        {
            if (dialog.isVisible()) {
                removeDialogMessage();
            } else {
                setDialogMessage("Hello world!\nHow are you?\nYay!");
            }
            dialog.toggleVisibility();
        } else if ("e".equals(k))
        {
            spawnEnemies();
        }
    }
    
    // get methods for rows/cols
    public int getCurrentRow() {
        return currentRow;
    }
    public int getCurrentCol() {
        return currentCol;
    }
    public int getNumRows() {
        return numRows;
    }
    public int getNumCols() {
        return numCols;
    }
    public Player getPlayer() {
        return player;
    }
}
