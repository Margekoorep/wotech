/*Hard:
1. Create a program, where user can provide a title and a small text below the title.
Title should be wrapped with ====== at top and bottom, based on the title length.
Example: 
System asks for title and user provides "WoTech and Java is easy"
System asks for description and user provides "I have been learning Java for 6 weeks now."

Result: 
=======================
WoTech and Java is easy
=======================

I have been learning Java for 6 weeks now.*/
import java.util.Scanner; 
public class Main{
  private static String title;
  public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please eneter a title: ");
     title = scanner.nextLine();
    System.out.println("Please eneter a text: ");
 String text = scanner.nextLine(); 
    border();
    System.out.println();
  System.out.println(title);

    border();
    System.out.println();
  System.out.println(text);
  }
  public static void border(){ // Here I need the var title to be outside in the main class
    String line = "=";
    int titleLenght = title.length();
    for (int i = 1; i <= titleLenght; i++){
      System.out.print(line);
    }
  }
  }

// MUTCH easier version

import java.util.Scanner; 
public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please eneter a title: ");
    String title = scanner.nextLine();
    System.out.println("Please eneter a text: ");
    String text = scanner.nextLine(); 
    int titleLenght = title.length();
    
    border(titleLenght);
    System.out.println();
    System.out.println(title);
    border(titleLenght);
    System.out.println();
    System.out.println(text);
  }
  public static void border(int lenght){ 
    String line = "=";
    for (int i = 1; i <= lenght; i++){ // here also works System.out.println(lines.repeat(lenght));
      System.out.print(line);
    }
  }
}
  
//_______________________________________________________

import java.util.Scanner;

/*
  Ask user for a title - inputText()
  Ask user for a description - inputText()


  PrintInformation()
    Figure out the size of title
    Print out a border of the size of the title -> printBorder()
    Print out the title
    Print out a border of the size of the title -> printBorder()
    Print out the description
*/


public class Main {
  public static void main(String[] args) {

    //Creating scanner
    Scanner scanner = new Scanner(System.in);

    //Calling method for getting title
    System.out.print("Enter a title: ");
    String title = getText();

    System.out.print("Enter a description: ");
    String description = getText();

    //Calling method to get printout with lines
    getPrintout(title, description);

    //Closing scanner
    scanner.close();
  }

  // Method to ask user for description
  public static String getText() {
    Scanner scanner = new Scanner(System.in);

    //Read user input
    String text = scanner.nextLine();

    //Return user input
    return text;
  }

    // Method to display the result with the title wrapped in = characters + description
/*    

    Figure out the size of title
    Print out a border of the size of the title -> printBorder()
    Print out the title
    Print out a border of the size of the title -> printBorder()
    Print out the description*/
  public static void getPrintout(String title, String description) {

    // Calc length
    int length = title.length();
    // Create top border
    printBorder(length);
    // Display the title
    System.out.print(title);

    System.out.println("");
    // Create bottom border
    printBorder(length);

    // Display the description
    System.out.println("");
    System.out.println(description);

  }

  public static void printBorder(int length){
    for (int i = 0; i < (length); i++) {
      System.out.print("=");
    }
    System.out.println("");
  }
}
