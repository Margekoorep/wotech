import java.util.Scanner;
import java.util.Random;
public class Main {
  public static void main(String[] args) {

  System.out.println("Welcome! This is a game of tic-tac-toe.\nYou will be playing against the computer.\nYou will be X and the computer will be O.\nYou will be asked to choose a row and column.\nThe first one to get 3 symbols in a row, column or diagonal wins.\n");

    String [][] playField = {
    {" ","|" ," ", "|", " "}, 
    {"—", " ", "—", " ","—"},
    {" ","|" ," ", "|", " "},
    {"—", " ", "—", " ","—"},
    {" ","|" ," ", "|", " "}
    };
        
    
    String playerSign = "X";
    String computerSign = "O";
    boolean gameOver = false;
    int counter = 0;

    while (gameOver == false){
      boolean validChoise = false;
      int column = 0;
      int row = 0;
      while (!validChoise){ // player's input for row and column
        System.out.println("Please choose a row 1, 2 or 3:");
        row = insertNumber (row);
    
        System.out.println("Please choose a column: 1, 2 or 3:");
        column = insertNumber (column);

        if (playField[row][column].equals(" ")){
          playField[row][column] = playerSign;
          counter = counter +1;
          validChoise = true;
          break;
        }else{
          System.out.println("This place is already taken. Please choose another place.");
        }
      }
        // Check if player is winner
      printArray(playField);
        if (checkWinner(playField, playerSign)) {
          System.out.println("You win!");
          gameOver = true;
          break;
        }
        if (counter >8) {
          System.out.println("It is a draw!");
          gameOver = true;
          break;
        }
        // Computer turn
      System.out.println("The computers choise is: ");
      validChoise = false;
      int computerRow = 0;
      int computerColumn = 0;
        while (!validChoise) {
          computerRow = randomNumber (computerRow);
          computerColumn = randomNumber (computerColumn);
            if(playField[computerRow][computerColumn].equals(" ")){
              playField[computerRow][computerColumn]= computerSign;
              validChoise = true;
              counter= counter+1;
            }
          
        }
         // check if computer is winner
      printArray(playField);
      if (checkWinner(playField,computerSign)) {
        System.out.println("You lose!");
        gameOver = true;
        break;
      }
      if (counter >8) {
        System.out.println("It is a draw!");
        gameOver = true;
        break;
      }
    }
    System.out.println("Thank you for playing!");
  }
  
  public static int insertNumber(int number){ // inserting indexes for the X.
    Scanner scanner = new Scanner(System.in);
    number = scanner.nextInt(); 
    boolean validNumber = false;
    while (!validNumber){
      if (number > 0 && number < 4){
        validNumber = true;
        break;
      }else{
        System.out.println("Please choose a number between 1 and 3:");
        number = scanner.nextInt();
      }
    }
    if(number == 3){
      number = number +1;
    }else if (number == 1){
      number = number -1;
    }
    return number;
  }
  
  public static void printArray(String array[][]){ // Printing the array.
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static boolean checkWinner(String[][] array, String sign){ // cheking for win
  // check rows
    for (int i = 0; i < array.length; i += 2) {
      if (array[i][0].equals(sign) && array[i][2].equals(sign) && array[i][4].equals(sign)) {
        return true;
      }
    }
    // Check columns
    for (int i = 0; i < array[0].length; i += 2) {
      if (array[0][i].equals(sign) && array[2][i].equals(sign) && array[4][i].equals(sign)) {
        return true;
      }
    }
    // Check diagonals
    if ((array[0][0].equals(sign) && array[2][2].equals(sign) && array[4][4].equals(sign)) ||
      (array[0][4].equals(sign) && array[2][2].equals(sign) && array[4][0].equals(sign))) {
      return true;
    }
    return false;
  }
  
  public static int randomNumber(int number){ // creating random index for computer
    Random random = new Random();
    number = random.nextInt(4); 
    if(number == 3){
      number = number +1;
    }else if (number == 1){
      number = number -1;
    }
    return number;
  }
}

