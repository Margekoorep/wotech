import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int size = 10;
    int [][] grid = new int [size][size];
    int bombColumn = 1;
    int bombRow = 1;
    // 1 1  1 0 0 0 0 0 0 0
    // 1 -1 1 0 0 0 0 0 jne
    // 1  1 1
    //  0 0 0 0 0 0 0 0 0  jne

    //MINDSWEEPER:
    grid[bombRow][bombColumn] = 5; // Center
    grid[bombRow - 1][bombColumn] = 1; // Top middle
    grid[bombRow - 1][bombColumn - 1] = 1; // top left
    grid[bombRow - 1][bombColumn + 1] = 1; // top right

    grid[bombRow + 1][bombColumn] = 1; // bottom middle
    grid[bombRow + 1][bombColumn - 1] = 1; //bottom left
    grid[bombRow + 1][bombColumn + 1] = 1; //bottom right

    grid[bombRow][bombColumn - 1] = 1; // middle left
    grid[bombRow][bombColumn + 1] = 1; //middle right
    
    printArray(grid, size);

    
  }
    public static void printArray (int[][] array, int size){
        for (int i = 0; i < size; i++){
          for (int j = 0; j < size; j++){
            System.out.print(array[i][j] + " ");
          }
          System.out.println();
        }
    }
  }



