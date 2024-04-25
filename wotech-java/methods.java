
public class Main {
  public static void main(String[] args) {
    printOutABorder();
      
    System.out.println("Hello world!");
    int number = getARandomNumber(); 
    System.out.println(number);
    printOutABorder();
  }
      
   
    // Method is when we have a code we want to run multiple times
    // Method == function : can be used both names
  // {} - shows when function starts and ends and that is what method prints/runs
   public static void printOutABorder(){
     System.out.println("===============");
   }
     public static int getARandomNumber(){ // not void, but have a return of int type
       return 5 ;
  }
    }

// access_modifier: It specifies the visibility of the method. It can be public, private, protected, or default (no modifier). Usually we use public!
//static =  it is always there that dosn't depend on enyone
//return_type: It specifies the type of value that the method returns. It can be any valid Java data type or void if the method does not return any value.
//method_name: It is the name of the method. It should follow the rules for naming identifiers in Java.
//parameter_list: It contains zero or more parameters (arguments) that are passed to the method. Each parameter consists of a data type followed by the parameter name.


public class Main {
  public static void main(String[] args) {
    int number1 = 5;
    int number2 = 7;
    int result = sum(number1, number2);
    System.out.println(result);
  }
  public static int sum(int number1, int number2){
    return number1 + number2;
  }
 
  
    }


//____________________________________________________
/*
  Write a name and check whether or not it is atleast 3 char long
   Write a surname and check whether or not it is atleast 3 char long
If it's not, then say. Sorry, your name is too short.
If both of them are valid, say. Thank you, your information has been registered!
*/

public class Main{
  public static void main(String[] args){

    String name = "a";
    String surname = "Klaumanis";
    boolean isUserNameValid = isNameValid(name); // Give the function "Oskars" as an argument
    //Because Oskars is longer than 3, isUserNameValid = true
    
    boolean isUserSurnameValid = isNameValid(surname); // Give the function "Klaumanis" as an argument
    //Because Klaumanis is longer than 3, isUserSurnameValid = true

    if(isUserNameValid && isUserSurnameValid){
      System.out.println("Thank you, your information has been registered!");
    } else {
      System.out.println("Sorry, your check your information");
    }
    
  }

  public static boolean isNameValid(String name){ //name == "Klaumanis"
    if(name.length() < 3){ //Checking whether or not "Klaumanis" length is less than 3
      System.out.println("Sorry, your name is too short.");
      return false;
    }

    return true; //Because "Klaumanis" length is more than 3, we return true
  }
}

//________________________________________________________

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
    int number = 51;
    checkNumber(number);
    int number2 = 49;
    checkNumber(number2);
/* We get the number
    We check whether or not it is bigger than 50
    We check whether or not it is smaller than 50
    We assume it is equal to 50 if all of the upper conditions are false
    */
    
  }
  public static void checkNumber(int number){
    if (number > 50){
       System.out.println(number + " is greater than 50");

     }else if (number < 50){
       System.out.println(number + " is less than 50");
     }else{
       System.out.println(number + " is equal to 50");
    }
  }

  
}
  
 //______________________________________________________
//RETURN:

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
    int number = 51;
     String result = checkNumber(number);
    System.out.println(result);
    
    int number2 = 49;
    
    result = checkNumber(number2);
    System.out.println(result);

    
  }
  
  public static String checkNumber(int number){
    if (number > 50){
       return number + " is greater than 50";

     }else if (number < 50){
       return  number + " is less than 50";
     }else{
       return number + " is equal to 50";
    }
  }

}

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    int money = 15;
    String result = buyJeans(money);
    System.out.println(result);
    
  }
 
public static String buyJeans(int money){
  int price = 30
  if(money > price){
    return "Person can buy jeans";
  }else{
    return "Person cannot buy jeans";
  }
}
  
}

//_____________________________-
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

// 7, 12,18 
// fint sum all together

    int number1 = 7;
    int number2 = 12;
    int number3= 18;

    int result = sum (number1, number2);
    int finalResult = sum (result, number3);
    System.out.println(finalResult);
}
  public static int sum(int a, int b){
    return a+b;
  }
}

###//___________________________________

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
 
