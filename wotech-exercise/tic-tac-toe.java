import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
/*Ask user for row and column and write in the two dimensional array a value "1" in the correct place.

Check whether or not the row chosen by user contains all 1.

If all elements in row contain 1, then let player know they won.*/

  System.out.println("Welcome! This is a game of tic-tac-toe.\nYou will be playing against the computer.\nYou will be X and the computer will be O.\nYou will be asked to choose a row and column.\nThe first player to get 3 in a row wins.\n");

    String [][] playField = {
    {" ","|" ," ", "|", " "}, 
    {"_", "_", "_", "_","_"},
    {" ","|" ," ", "|", " "},
    {"_", "_", "_", "_","_"},
    {" ","|" ," ", "|", " "}
    };
    Scanner myObj = new Scanner(System.in);

    
    System.out.println("Please choose a row 1, 2 or 3:");
    int row = myObj.nextInt(); 
    if(row == 3){
      row = row +1;
    }else if [row = 1){
      row = row -1;
    }
   
    System.out.println("Please choose a column: 1, 2 or 3:");
    int column = myObj.nextInt();
    if (column == 1){
      column = column -1;
    }else if (column == 3){
      column = column +1;
    }
    System.out.println(playField);

    
    playField[row][column]= "X";
    for(int i = 0; i < playField.length; i++){
      for(int j = 0; j < playField[i].length; j++){
      

    System.out.print(playField[i][j] + " ");
      }
      System.out.println();
    }
    
 
}
  public static void insert_number(String number){
    System.out.println("Please choose a row 1, 2 or 3:");
    Scanner row = new Scanner(System.in);
    System.out.println("Please choose a column: 1, 2 or 3:");
    Scanner column = new Scanner(System.in);
  }
}


