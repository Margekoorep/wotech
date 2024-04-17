// original 

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    int number = scanner.nextInt(); 

    for(int i = 1; i <= number; i++){

      if(i % 3 == 0 && i % 5 == 0){
        System.out.println("WoTech");

      } else if (i % 3 == 0){
        System.out.println("Wo");
      } else if (i % 5 == 0){
        System.out.println("Tech");
      } else {
        System.out.println(i);

      }
      scanner.close();
    }
  }
}

// Optimized version 

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    int number = scanner.nextInt(); //15

    for(int i = 1; i <= number; i++){
      // 1 2 3 4 5 ... 15
      String result = "";
      if (i % 3 == 0){ // 3 6 9 12 15
        result += "Wo";
      } 
      if (i % 5 == 0){ // 5 10 15
        result += "Tech";
      } 
      if(result.equals("")){ //if result is empty this is same as if(result == "")
        result = String.valueOf(i); //Then result = i (number), because number is iteger it converts it to string.
      }
      System.out.println(result);

      scanner.close();
    }
  }
}
