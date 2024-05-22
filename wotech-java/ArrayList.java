import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    // Dynamic array - array list 
    // initalize array list
    
    ArrayList<String> shopsItems = new ArrayList<String>();
      var scanner = new Scanner(System.in);
    while (true){
      System.out.print("Please enter item name (or 'exit' to quit): ");
        var item = scanner.nextLine();
      if (item.equals("exit")){
        break;
      }
  // Adding item
      addItem(shopsItems, item);
    }

      printArrayList(shopsItems);

// Removing item. 
    System.out.print("Please enter item you want to remove from list: ");
    var itemToRemove = scanner.nextLine();
    shopsItems.removeIf(item -> item.equals(itemToRemove));

    printArrayList(shopsItems);

// filtering 
    var filteredArrayList = new ArrayList<String>();
    for(String item: shopsItems){
      if (item.length() <= 5){
        filteredArrayList.add(item);
      }
    }
    printArrayList(filteredArrayList);
  
  }
  public static void printArrayList(ArrayList<String> items){
    System.out.println("Store has these items: ");
    for (String item: items){
      System.out.println(item);

    }
  }
  public static void addItem(ArrayList<String> items, String item ){
    items.add(item);  
    System.out.println(item + " has been added to the store.");
  }
 
}

