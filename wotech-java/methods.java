
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
 
