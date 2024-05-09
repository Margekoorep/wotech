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
      System.out.print(array[i][j]);
    }
    }
      }
  }

// Another way 

public class Main {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < array.length; i++){ 
            //array[0] = {1, 2, 3}
            //array[0].length = 3
            int[] row = array[i]; // {1, 2, 3} OR {4, 5, 6} OR, {7, 8, 9}
            for(int j = 0; j < row.length; j++){
                System.out.print(row[j]); //PROCESSING ROWS HERE
            }
            System.out.println();       
        }  
    }
}

_______________________________________________________________________________________

  
public class Main {
  public static void main(String[] args) {
  
  int[][] array = new int [5][5];
    
    for (int i= 0; i< array.length; i++){
      int[] row= array [i];
      for (int j= 0; j< row.length; j++){
          row[j] = j;
    }
    }
    for(int i = 0; i < array. length; i++){
      for(int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + "|");
      }
    System.out.println();
    System.out.println("----------");
    }
      }
  }

_______________________________________________________________________________
  
public class Main {
  public static void main(String[] args) {
  
    int[][] array = new int [5][5];
      
    for (int i= 0; i< array.length; i++){
        int[] row= array [i];
        for (int j= 0; j< row.length; j++){
            row[j] = i*j;
        }
    }
    for(int i = 0; i < array. length; i++){
        for(int j = 0; j < array[i].length; j++){
          if(array[i][j]<10){
            System.out.print(array[i][j] + "  ");
          }else{
            System.out.print(array[i][j] + " ");
          }
        }
      System.out.println();
    }
  }
  
}
