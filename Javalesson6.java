public class Main {
  public static void main(String[] args) {

    double temp = 22.12;
    String message = "The weather is good outside";

    if (temp <= 5) {
      
      System.out.println(message);
    } else if (temp <= 15) {
      System.out.println(message);
    } else if (temp <= 30) {
      System.out.println(message);
    } else {
      System.out.println(message);
    }
    
        System.out.println("Let's go and check out what is in the fridge!");
        var isFridgeOpen = false;
        String result;// reserv a place but it is empty now, we give value later (ln 26)

        if (isFridgeOpen) {
          var item1 = "Cheese";
          var item2 = "Milk";
          var item3 = "Eggs";
          result = item1 + item2 + item3;
        } else {
          result = "Fridge is closed, open the fridge";
        }

        System.out.println(result);
        // ERROR System.out.println(item1);
  

  }
}

// 

public class Main {
  public static void main(String[] args)  {
//main method  is unic and must be present in every java program, it is entry. Is automatacly run, other methods need to be called
    int mainValue = 14;
      System.out.println(mainValue);
  firstMethod(); //method is called!
  
  }

  public static void firstMethod(){
  //method 1
    secondMethod(); // because the firstM is already called you can call secondM in main or first
    int firstValue = 50;
    System.out.println(firstValue);
  }

  public static void secondMethod(){
    //method 2
    int secondValue = 120;
    System.out.println(secondValue);
  }
}
