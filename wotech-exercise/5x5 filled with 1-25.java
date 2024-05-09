/*Easy: 
Fill the 5x5 array with numbers from 1 to 25
1 2 3 4 5
6 7 8 9 10
...
But you have to use for loop to fill it up automatically.*/


public class Main {
  public static void main(String[] args) {
       
   int[][] array = new int [5][5];
    int counter = 1;
    for (int i= 0; i< array.length; i++){
      for (int j= 0; j< array.length; j++){
        array[i][j] = counter;
        counter++;
    }
    }
     
    for(int i = 0; i < array. length; i++){
        for(int j = 0; j < array[i].length; j++){
          if(array[i][j]<10){
            System.out.print(array[i][j] + "  ");
          }else{
            System.out.print(array[i][j] +" ");
          }
      }
      System.out.println();
    }
  }
}
