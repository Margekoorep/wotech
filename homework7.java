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


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines for the triangle: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        scanner.close();
    }
}
