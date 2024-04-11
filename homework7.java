import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        int guessNumber; 
        int rightNumber = 55;
      
        System.out.println("Guess a number between 1 and 100");
        guessNumber = scanner.nextInt();
        while (guessNumber != rightNumber){
        if (guessNumber < rightNumber){
          System.out.println("Right number is bigger than " + guessNumber + "." + " Guess again:");
          guessNumber = scanner.nextInt();
        }else if (guessNumber > rightNumber){
          System.out.println("Right number is smaller than " + guessNumber +"." + " Guess again:");
          guessNumber = scanner.nextInt();
        }
     if (guessNumber == rightNumber){
            System.out.println("Congratulations " + guessNumber + " is the right number!");
        }
          
        }
        
      scanner.close(); 
    }
}
//____________________________________________________________________________
// another way 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        int number = 58;
      boolean userGuessedCorrectly = false;
      while(!userGuessedCorrectly){
        System.out.println("Guess a number");
        int guess= scanner.nextInt();

        if (number==guess){
          System.out.println("You guessed correctly!");
          userGuessedCorrectly = true;
        }else if(number< guess){
          System.out.println("Number too big");
        }else{
          System.out.println("Number too small");
        }
        
      }
      System.out.println("Game over!");

      
        
      scanner.close(); 
    }
}
//___________________________________________________________

// WHILE TRUE LOOP, Rather not use, code needs to be clearer. While (true) doesnt give a lot of information. Also code without break or continue is better!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        int number = 58;
      boolean userGuessedCorrectly = false;
      while(true){
        System.out.println("Guess a number");
        int guess= scanner.nextInt();

        if (number==guess){
          System.out.println("You guessed correctly!");
          break;
        }
        if(number< guess){
          System.out.println("Number too big");
          continue;
        }
          System.out.println("Number too small");
      }
      System.out.println("Game over!");
      scanner.close(); 
    }
}

//________________________________________________________________________


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines for the triangle: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }

            System.out.println();
        }

        scanner.close();
    }
}

//__________________________________________________________________________________
// version 2 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines for the triangle: ");
        int number = scanner.nextInt();
        String result = "";
        for (int i = 1; i <= number; i++) {
          result = result + "_";
          System.out.println(result);
            
        }

        scanner.close();
    }
}

//______________________________________________________________________________________
//Other side 

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Triangle
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please write a number!");
    int number = scanner.nextInt();


   String space = " ";
    String underScore = "_";
    //int underscores = i;
    for(int i = 1; i <= number; i++) {
      int spacesCount = number - 1;
      String lineResult = space.repeat(spacesCount);
      String underScoreResult = underScore.repeat(i);
      lineResult = lineResult + underScoreResult;
      System.out.println(lineResult);
    }
    scanner.close();
}

}
