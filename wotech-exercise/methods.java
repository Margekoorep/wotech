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
  
