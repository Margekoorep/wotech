// My fisrt method
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String word; 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Write a word");
        word = scanner.next();
      String space = " ";
      String topAndBottomLine ="=";
      String sideOfBox = "|";
      int wordLength = word.length();

      //First line : "="
      for (int i = 1; i <= wordLength + 4; i++){
        System.out.print(topAndBottomLine);
      }
      System.out.println();
      //Second line :"|       |"
         System.out.print(sideOfBox);
          for (int i = 1; i <= wordLength + 2; i++){
          System.out.print(space);
           }
          System.out.print(sideOfBox);
      System.out.println();
      //Third line :"|   word   |"
        System.out.print(sideOfBox +" " + word + " " +sideOfBox);
      System.out.println();
      //Fourth line :"|       |"
       System.out.print(sideOfBox);
        for (int i = 1; i <= wordLength + 2; i++){
        System.out.print(space);
         }
        System.out.print(sideOfBox);
      System.out.println();
      //Fift line :"="
        for (int i = 1; i <= wordLength + 4; i++){
          System.out.print(topAndBottomLine);
        }
      scanner.close(); 
    }
}

// 2 Version: Choose your box border

import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please write a short text!");
    String text = scanner.nextLine();
    int stringLength = text.length();
    System.out.println("Select 1 symbol for frame!");
    String symbol = scanner.nextLine();

    String space = " ";
    String border = symbol;

    int spacesCount = stringLength + 4;
    int spacesCount2 = 2;
    int borderCountHorizontal = stringLength + 6;
    String lineResult1 = border.repeat(borderCountHorizontal);
    String lineResult2 = border + space.repeat(spacesCount) + border;
    String lineResult3 = border + space.repeat(spacesCount2) + text + space.repeat(spacesCount2) + border;


      System.out.println(lineResult1);
      System.out.println(lineResult2);
      System.out.println(lineResult3);
      System.out.println(lineResult2);
      System.out.println(lineResult1);


    scanner.close();
  }


// Using .repeat

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your input:");
    String input = scanner.nextLine();
    scanner.close();

    int lengthOfInput = input.length();
    String topOfbox = "-";
    String sidesOfbox = "|";
    String space = " ";
    
    System.out.println(topOfbox.repeat(lengthOfInput + 4));
    System.out.println(sidesOfbox + space.repeat(lengthOfInput + 2) + sidesOfbox);
    System.out.println(sidesOfbox + space + input + space + sidesOfbox);
    System.out.println(sidesOfbox + space.repeat(lengthOfInput + 2) + sidesOfbox);
    System.out.println(topOfbox.repeat(lengthOfInput + 4));


  }
}

