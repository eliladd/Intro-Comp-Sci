## Game of Life

* Put all of your code into `GameOfLifeFunctions.java`. Each function is labeled.
* Run `MainGUI` to test your code

### Rules
* Loneliness: Any live cell with fewer than two live neighbors dies.
* Overcrowding: Any live cell with more than three live neighbors dies.
* Survival: Any live cell with two or three live neighbors lives on to the next generation.
* Birth: Any dead cell with exactly three live neighbors becomes a live cell.

### How to test your code
* `toggleCell` Clicking a cell should toggle it between alive and dead (red and white).
* `resetCells` Clicking the reset button should clear all cells (make them dead).
* `copyCells` This is used by the undo function.
* `getNumLiveNeighbors` Right click any cells and it will pop up a window showing the number of live neighbors.
* `calculateNextGeneration` Clicking the STEP button should calculate the next generation of cells based on the rules above and display it. You can create small test cases to make sure things are working.
* `readFromString` and `writeToString` These functions are used to save the state of the board to a String to write it to a file, and to read the state of the board from a String. You can test these functions by saving the state of the board to a file, then reading it back in and displaying it.

