
/**
 * 
 * ALL OF YOUR CODE GOES IN HERE
 *
 * 
 */
public class GameOfLifeFunctions
{

    /**
     * If row or col are out of range, do nothing.
     * Otherwise, if row, col of board is 0 switch it to 1
     * and if it's 1 switch it to 0.
     */
    public static void toggleCell(int row, int col, int[][] cells) {
        /** 
         * If the cell was 0, make it 1, and if it was 1, make it 0.
         * 
         */
        
    }
    
    /**
     * Reset the all cells to 0
     */
    public static void resetCells(int[][] cells) 
    {
        int h = cells.length;
        int w = cells[0].length;
    }
    
    /**
     * Return a new 2D array that is an exact copy of the current cells.
     * 
     * Copy all of the cells in the board into the new copy.
     * 
     * This is used by the "undo step" function.
     * 
     */
    public static int[][] copyCells(int[][] cells) 
    {
        int[][] copy=new int[cells.length][cells[0].length];
        
        // copy all of the cells from cells into copy and return copy 
        
        return copy;
    }
    
    
    /**
     * Return the number of live neighbor cells on the given board at the given
     * row and column.
     * 
     */
    public static int getNumLiveNeighbors(int[][] cells, int row, int col) 
    {
        int neighbors=0;

        /* 
         * Get the number of live neighbors at the given row and column
         * from the 2D array cells.
         * 
         * You can structure this with 8 statemetns, each protected by an
         * if statement, like this:
         * 
         * int neighbors = 0;
         * if (OK to look up-left) {
         *      neighbors += cells[row-1][col-1];
         * }
         * if (OK to look left) {
         *      neighbors += cells[row][col-1];
         * }
         * etc
         * 
         */
        
        return neighbors;
    }

    /**
     * Return a 2D array that represents the state of the board
     * for the next generation. Remember the rules for Conway's
     * Game of Life:
     * 
     * Loneliness: fewer than 2 neighbors and a living cell dies
     * Happiness: 2 or 3 neighbors, a living cell lives to the next generation
     * Overcrowding: more than 3 neighbors and a living cell dies
     * Reproduction: exactly 3 neighbors makes a dead cell alive
     */
    public static int[][] calculateNextGeneration(int[][] cells) 
    {
        int[][] result=new int[cells.length][cells[0].length];

        /*
         * Create a new generation in result.
         * 
         * This function should use the getNumLiveNeighbors() function
         * on each cell. This method is probably easier than you think,
         * once getNumLiveNeighbors() is working correctly.
         * 
         */
        
        
        return result;
    }

    /*
     * These are the challenge functions for people who really want to work
     * their programming skills. Check the rubric for their value.
     * 
     */
    

    /**
     * You are given an array of Strings, where each String contains only
     * zeros and ones. Each String represents a row of the board.
     * For example:
     * 001
     * 011
     * 101
     * 
     * is a 3x3 board with 4 dead cells and 5 live cells.
     * 0, 0 is dead, while 2, 2 is alive.
     * 
     * Convert this into a 2D array of ints.
     * 
     * Remember that THE ARRAY OF STRINGS WILL NOT ALWAYS BE 3x3.
     * That was just an example. You have to check the array of Strings
     * to see how bit it is.
     */
    public static int[][] readFromString(String[] lines) {
        int[][] board=new int[lines.length][lines[0].length()];
        // TODO
        return board;
    }

    /**
     * Return an array of Strings that represents the 2D grid
     * of cells, where there is a String for each row,
     * and each column of the String is 0 for a dead cell
     * and 1 for a living cell.
     */
    public static String[] writeToString(int[][] board) {
        String[] result=new String[board.length];
        // TODO
        return result;
    }
}
