import java.util.Scanner;

// Ubah program Sudoku ini menjadi menggunakan object Sudoku

public class MainSudoku_object { 
  private int[][] grid ;

  public MainSudoku_object(int[][] grid) {
    this.grid = grid;
  }

  public MainSudoku_object(){
    this.grid = new int[9][9];
    this.grid = readAPuzzle();
  }
  public static void main(String[] args) {

    MainSudoku_object sudoku = new MainSudoku_object();

    if (!sudoku.isValid())
      System.out.println("Invalid input");
    else if (sudoku.search()) {
      System.out.println("The solution is found:");
      sudoku.printGrid();
    }   
    else
      System.out.println("No solution");
  }
  
  /** Read a Sudoku puzzle from the keyboard */
  public int[][] readAPuzzle() {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a Sudoku puzzle:");
    int[][] grid = new int[9][9];
    for (int i = 0; i < 9; i++) 
      for (int j = 0; j < 9; j++)
        grid[i][j] = input.nextInt();
    input.close();
    return grid;
  }

  /** Obtain a list of free cells from the puzzle */
  public int[][] getFreeCellList() {
    // Determine the number of free cells 
    int numberOfFreeCells = 0;   
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 9; j++) 
        if (grid[i][j] == 0) 
          numberOfFreeCells++;
    
    // Store free cell positions into freeCellList 
    int[][] freeCellList = new int[numberOfFreeCells][2];
    int count = 0;
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 9; j++) 
        if (grid[i][j] == 0) {
          freeCellList[count][0] = i;
          freeCellList[count++][1] = j;
        }
    
    return freeCellList;
  }

  /** Print the values in the grid */
  public void printGrid() {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++)
        System.out.print(grid[i][j] + " ");
      System.out.println();
    }
  }

  /** Search for a solution */
  public boolean search() {
    int[][] freeCellList = getFreeCellList(); // Free cells
    if (freeCellList.length == 0) 
      return true; // "No free cells");
    
    int k = 0; // Start from the first free cell      
    while (true) {
      int i = freeCellList[k][0];
      int j = freeCellList[k][1];
      if (grid[i][j] == 0) 
        grid[i][j] = 1; // Fill the free cell with number 1

      if (isValid(i, j)) {
        if (k + 1 == freeCellList.length) { // No more free cells 
          return true; // A solution is found
        }
        else { // Move to the next free cell
          k++;
        }
      }
      else if (grid[i][j] < 9) {
        // Fill the free cell with the next possible value
        grid[i][j] = grid[i][j] + 1; 
      }
      else { // free cell grid[i][j] is 9, backtrack
        while (grid[i][j] == 9) {
          if (k == 0) {
            return false; // No possible value
          }
          grid[i][j] = 0; // Reset to free cell
          k--; // Backtrack to the preceding free cell
          i = freeCellList[k][0];
          j = freeCellList[k][1];
        }

        // Fill the free cell with the next possible value, 
        // search continues from this free cell at k
        grid[i][j] = grid[i][j] + 1; 
      }
    }
  }

  /** Check whether grid[i][j] is valid in the grid */
  public boolean isValid(int i, int j) {
    // Check whether grid[i][j] is valid at the i's row
    for (int column = 0; column < 9; column++)
      if (column != j && grid[i][column] == grid[i][j])
        return false;

    // Check whether grid[i][j] is valid at the j's column
    for (int row = 0; row < 9; row++)
      if (row != i && grid[row][j] == grid[i][j])
        return false;

    // Check whether grid[i][j] is valid in the 3 by 3 box
    for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
      for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
        if (row != i && col != j && grid[row][col] == grid[i][j])
          return false;

    return true; // The current value at grid[i][j] is valid
  }

  /** Check whether the fixed cells are valid in the grid */
  public boolean isValid() {
    for (int i = 0; i < 9; i++)
      for (int j = 0; j < 9; j++)
        if (grid[i][j] < 0 || grid[i][j] > 9 ||
           (grid[i][j] != 0 && !isValid(i, j))) 
          return false;

    return true; // The fixed cells are valid
  }
}

