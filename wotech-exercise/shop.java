import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shopOpen = true;
        Shop shop = new Shop();
        System.out.println("Welcome to the Shop!");
        while (shopOpen) {
                System.out.println("If you wish to enter shop item management, please enter 1");
                System.out.println("To enter the shopping area, enter 2");
                System.out.println("To exit, enter 3");
                int userInput1 = scanner.nextInt();
                if (userInput1 == 1) {
                    manageShop(scanner, shop);

                } else if (userInput1 == 2) {
                    shoppingArea(scanner, shop);
                } else if (userInput1 == 3) {
                    System.out.println("Goodbye!");
                    shopOpen = false;
                } else {
                    System.out.println("Please enter a valid option");
                }

        }
    }
        public static void createItem(Shop shop){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input the item ID");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.println("Please input the name of the item");
            String name = scanner.nextLine();
            System.out.println("Please input the item cost");
            int cost = scanner.nextInt();
            Item item = new Item(id, name, cost);
            shop.addItem(item);

        }
        public static void manageShop(Scanner scanner, Shop shop) {
            boolean shopManagerActive = true;
            while (shopManagerActive) {
                System.out.println("To add item to store, enter 1");
                System.out.println("To remove item from store, enter 2");
                System.out.println("To update item in store, enter 3");
                System.out.println("To see items list, enter 4");
                System.out.println("To exit, enter 5");
                int userInput = scanner.nextInt();
                if (userInput == 1) {
                    createItem(shop);
                } else if (userInput == 2) {
                    System.out.println("Please enter the item ID you would like to remove");
                    int itemId = scanner.nextInt();
                    shop.removeItem(itemId);
                } else if (userInput == 3) {
                    System.out.println("Please enter the item ID you would like to update");
                    int itemId2 = scanner.nextInt();
                    System.out.println("Please enter the item ID you would like to update");
                    String newName = scanner.nextLine();
                    System.out.println("Please enter the item ID you would like to update");
                    int newCost = scanner.nextInt();
                    shop.updateItem(itemId2, newName, newCost);
                } else if (userInput == 4) {
                    ArrayList<Item> items = shop.getItems();
                    for (Item item1 : items) {
                        System.out.println(item1);
                    }
                } else if (userInput == 5) {
                    System.out.println("You have exited the Shop!");
                    shopManagerActive = false;

                }
            }
        }

        public static void shoppingArea(Scanner scanner, Shop shop) {
            boolean shoppingActive = true;
            System.out.println("You have entered the shopping area.");
            while (shoppingActive) {
                System.out.println("\nTo add item to cart, enter 1");
                System.out.println("To remove item from cart, enter 2");
                System.out.println("To head to checkout, enter 3");
                System.out.println("To exit shop, enter 4");

                int userInput2 = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (userInput2 == 1) {
                    System.out.println("Please enter the item you would like to add to the cart");
                    String chosenItem = scanner.nextLine();
                    for (Item item : shop.getItems()) {
                        if (item.getName().equals(chosenItem)) {
                            shop.addItemToCart(item);
                        }
                    }
                } else if (userInput2 == 2) {
                    System.out.println("Please enter the Item ID you would like to remove from the cart");
                    int chosenID = scanner.nextInt();
                    shop.removeFromCart(chosenID);
                } else if (userInput2 == 3) {
                    System.out.println("You have chosen to head to checkout");
                    var sum = shop.checkout();
                    System.out.println("Your total is " + sum +"€" );
                } else {
                    System.out.println("You have exited the Shop!");
                    shoppingActive = false;

                }
            }
        }
}

____________________________________________________

public class Item {
    private int id;
    private String itemName;
    private int cost;

    public Item(int id, String name, int cost) {
        this.id = id;
        this.itemName = name;
        this.cost = cost;
    }

    public void setName(String name){
        // do some logic here
        this.itemName = name;
        // do some logic here
    }
    public String getName(){
        return itemName;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    public int getCost(){
        return cost;
    }
    public Item (int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

_________________________________________________
  import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Item> cart = new ArrayList<Item>();

    public ArrayList<Item> getItems(){
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int id) {
        for (var item : items) {
            if (item.getId() == id) {
                items.remove(item);
                return;
            }
        }
    }

    public void updateItem(int id, String name, int cost) {
        for (var item : items) {
            if (item.getId() == id) {
                item.setName(name);
                item.setCost(cost);
                return;
            }
        }
    }



    public void addItemToCart(Item item) {
        cart.add(item);
    }
    public void removeFromCart(int id) {
        for ( var item : cart){
            if (item.getId() == id){
                cart.remove(item);
                return;
            }
        }
    }

    public int checkout() { // get the total cost
        int sum = 0;
        for (var item : cart) {
            sum += item.getCost();
        }
        return sum;
    }

}
