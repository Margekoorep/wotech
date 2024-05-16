// VERSION 1

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
    printArray(playField);
    
 
}
  public static void insert_number(String number){
    System.out.println("Please choose a row 1, 2 or 3:");
    Scanner row = new Scanner(System.in);
    System.out.println("Please choose a column: 1, 2 or 3:");
    Scanner column = new Scanner(System.in);
  }
  public static void printArray(int array[][]){
    for(int i = 0; i < playField.length; i++){
      for(int j = 0; j < playField[i].length; j++){
      

    System.out.print(playField[i][j] + " ");
      }
      System.out.println();
    }
}


  // VERSION 2__________________________________________________-
  String [][] playField = {
    {" ","|" ," ", "|", " "}, 
    {"_", "_", "_", "_","_"},
    {" ","|" ," ", "|", " "},
    {"_", "_", "_", "_","_"},
    {" ","|" ," ", "|", " "}
    };
    Scanner myObj = new Scanner(System.in);
    int row = 0;
    String playerSign = "X";
    int column = 0;
    int counter = 0;
    boolean gameOver = false;
    int randomRow = 0;
    int randomColumn = 0;
    
    while (gameOver == false){
      int rowCounter = 0;
    System.out.println("Please choose a row 1, 2 or 3:");
    row = insertNumber (row);

    System.out.println("Please choose a column: 1, 2 or 3:");
    column = insertNumber (column);
    
    playField[row][column]= playerSign;
    printArray(playField);
    counter = counter +1;
        
      for (int i = 0; i < playField.length; i++){
          if (playField[row][i] == playerSign){
            rowCounter = rowCounter+1;
          
          }
      }
      if (rowCounter == 3){
        System.out.println("You won!");
        gameOver = true;
      }
      
    
    }
}
  public static int insertNumber(int number){
    Scanner myObj = new Scanner(System.in);
     number = myObj.nextInt(); 
    if(number == 3){
      number = number +1;
    }else if (number == 1){
      number = number -1;
    }
    return number;
  }
  public static void printArray(String array[][]){
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){

    System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}


//VERSION 3 _________________________________________________________
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
/*Ask user for row and column and write in the two dimensional array a value "1" in the correct place.

Check whether or not the row chosen by user contains all 1.

If all elements in row contain 1, then let player know they won.*/

  System.out.println("Welcome! This is a game of tic-tac-toe.\nYou will be playing against the computer.\nYou will be X and the computer will be O.\nYou will be asked to choose a row and column.\nThe first one to get 3 in a row, column or diagonal wins.\n");

    String [][] playField = {
    {" ","|" ," ", "|", " "}, 
    {"_", "_", "_", "_","_"},
    {" ","|" ," ", "|", " "},
    {"_", "_", "_", "_","_"},
    {" ","|" ," ", "|", " "}
    };
    Scanner myObj = new Scanner(System.in);
    int row = 0;
    String playerSign = "X";
    int column = 0;
    int counter = 0;
    boolean gameOver2 = false;
    int computerRow = 0;
    int computerColumn = 0;
    
    while (gameOver2 == false){
      int rowCounter = 0;
    System.out.println("Please choose a row 1, 2 or 3:");
    row = insertNumber (row);

    System.out.println("Please choose a column: 1, 2 or 3:");
    column = insertNumber (column);
    
    playField[row][column]= playerSign;
    printArray(playField);
    counter = counter +1;
        
    gameOver2 = checkWinner(playField, row, playerSign, gameOver2);
    gameOver2= checkWinner2(playField, column, playerSign, gameOver2);
    }

    if (gameOver2){
      System.out.println("You won!");
    }
}
  public static int insertNumber(int number){ // inserting indexes for the X.
    Scanner myObj = new Scanner(System.in);
     number = myObj.nextInt(); 
    if(number == 3){
      number = number +1;
    }else if (number == 1){
      number = number -1;
    }
    return number;
  }
  public static void printArray(String array[][]){ // Printing the array
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){

    System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static boolean checkWinner(String array [][], int number, String sign, boolean gameOver){ // cheking the row for X
    
    int rowCounter = 0;
    for (int i = 0; i < array.length; i++){
      if (array[number][i] == sign){
        rowCounter = rowCounter+1;

      }
    }
    if (rowCounter == 3){
    return true;
    }else{
      return false;
    }
  }
  public static boolean checkWinner2(String array [][], int number, String sign, boolean gameOver){// cheking the column for X

    int rowCounter = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i][number] == sign){
        rowCounter = rowCounter+1;

      }
    }
    if (rowCounter == 3){
    return true;
    }else{
      return false;
    }
  }
}

/* next time
1. make the cheking for diagonals
2. mhave computer insert the O-s 
3. chek if available when user inserts row and column
What happens if they dont write 1, 2 or 3 ???
3. Finish it! */

