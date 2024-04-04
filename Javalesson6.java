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
