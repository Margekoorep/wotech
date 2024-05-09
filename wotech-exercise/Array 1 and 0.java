/*Medium: 
1. Fill up every second row with value 1
2. Fill up every second column with value 1
*/
public class Main {
  public static void main(String[] args) {

    int[][] array = new int [8][8];
     for(int i = 1; i < array.length; i++){
        for(int j = 1; j < array[i].length; j++){
          if(i % 2 == 0 || j % 2 == 0){
            array[i][j]= 1;
            System.out.print(array[i][j] + " ");
          }else{
            System.out.print(array[i][j] + " ");
          }
        }

          System.out.println();
     }
  }
}

