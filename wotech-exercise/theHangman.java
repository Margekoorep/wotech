
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
  String [] theWord ={"k","a","s","s"};
  //make up the correct word 
int inCorrectGuesses = 0;
int correctGuesses = 0;
  
  //make the game over losing condtition
while (inCorrectGuesses < 6 && correctGuesses < theWord.length){ //create a while loop for the came to play and state the end condtition for while loop. 
  System.out.println("Guess a letter:");
  Scanner guessedLetter = new Scanner(System.in);
  boolean correctGuess = false;
  String guess = guessedLetter.nextLine();
  for (int i=0; i<theWord.length; i++){
    if (guess.equals(theWord[i])){
      System.out.println("You have guessed the " + (i+1) +"." + " letter");
      correctGuesses = correctGuesses + 1;
      correctGuess = true;
      
    }
  }

    if(!correctGuess){
      System.out.println("You guessed a incorrect letter");
      inCorrectGuesses = inCorrectGuesses + 1;
      System.out.println("You have " + inCorrectGuesses + " incorrect guesses");
    }else{
  
  System.out.println("You have " + correctGuesses + " correctly guessed letters");
  

  }
    
}
    if (inCorrectGuesses == 6){
      System.out.println("You have lost");
    }else{
System.out.println("You have won.");
  }
  }
}
