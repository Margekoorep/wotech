
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
 
