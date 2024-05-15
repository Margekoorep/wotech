import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int [8][8];
    array[2][4]=10;
    boolean gameover = false;
      while (gameover == false){
          System.out.println("Select a row from 1 to 8: ");
          int x = getIndex(scanner);
          System.out.println("Select a column from 1 to 8: ");
          int y = getIndex(scanner);
      
          System.out.println("You entered: row " + (x+1) + " and column " + (y+1)+".");
            
        if (array[x][y] == 10){
            System.out.println("You found the number!");
            gameover = true;
        }else{
            System.out.println("You did not find the number, try again.");
        }
            System.out.println();
      }
    
      if (gameover == true){
          System.out.println("Congratulation You win!");
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
    scanner.close();
  }
  public static int getIndex(Scanner scanner){
    int number = scanner.nextInt();
    return number-1;
    }
  
}
