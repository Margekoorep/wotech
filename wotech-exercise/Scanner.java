import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);

  System.out.println("Enter name: ");
  String name = myObj.nextLine(); 
  // Read user input
  System.out.println("Enter age"); 
  int age = myObj.nextInt();
  
  System.out.println("Enter height");
  double height = myObj.nextDouble();
  myObj.nextLine();
  
  System.out.println("Enter date of birth");
  String dateOfBirth = myObj.nextLine();

  System.out.println(name + " is " + age + " years old and " + height + " cm tall"+ ", their date of birth is " + dateOfBirth + ".");
  myObj.close();
}
}
