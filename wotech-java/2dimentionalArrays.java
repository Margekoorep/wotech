//one dimentional array
int[] array = {45,47, 3, 5, 10, 13}; 

/* two dimentional array (basically excel tabel:D ): an array that contains a array. Arrays are horisontal, 
columns are values of different arrays. */


public class Main {
  public static void main(String[] args) {
    int [] oneDimArray = {1,2,3};
  int[][] array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
  };
    for (int i= 0; i< oneDimArray.length; i++){
      System.out.println(oneDimArray[i]);
    }
    for (int i= 0; i< array.length; i++){
      for (int j= 0; j< array[i].length; j++){
      System.out.println(array[i][j]);
    }
    }
      }
  }

