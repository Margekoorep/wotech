import java.util.Random;
public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int[][] array = new int [5][5];
    
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
      array[i][j]= random.nextInt (9);
    
    System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
  
}
