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

//____________________________________________--

/*
Hard:
1. Fill the party list with people you would like to invite to the party.
Check whether or not "Anna" is in the array.
Check whether or not "Maris" is in the array.
["Oskars", "Anna", "Andris"]
Result: 
"Anna is in the party list"
"Maris is not in the party list"

*/
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {


    String[] arr ={"Oskars", "Anna", "Andris"};
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a name: ");
    String enteredName = scanner.nextLine();

    String result = name(enteredName, arr);
    System.out.println(result);
  
  }
  public static String name (String name, String[] arr){
    Boolean nameIsInList = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(name)) {
        nameIsInList = true;
        break;
      }
    }
      if (nameIsInList) {
        return name + " is in the party list";
      } else {
        return name + " is not in the party list";
      }
  }
    }
 //____________________________________________________-

/*
medium:
1. Parent simulator, a user provides a number (average grade) to the program, and if it's above 8, then parents go hooray, else they go sad

User creates 3 functions
    1. Function called hooraay(), is a void, and returns nothing. It's only job is to print out "Hooraay" in the console
    2. Function called sad(), is a void, and returns nothing. It's only job is to print out "Sad" in the console
    2. Function is called CheckGrades and receives int as value, but returns nothing. It's job is to call hooray() function, if the grade that it received is above 8, and call sad() function, if the grades received is less than 8

*/
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    System.out.println("Enter the avarage grade: ");
    Scanner scanner = new Scanner(System.in);
    int avarageGrade = scanner.nextInt();
    scanner.close();
    
    checkGrades(avarageGrade);
  }
 
  public static void checkGrades(int grade){
    if (grade > 8){
      hooraay();
    }else{
      sad();
    }
    return;
  }
  
  public static void  hooraay(){
    System.out.println("Hooraay!");
  }
  public static void sad(){
    System.out.println("Sad!");
  }
}
