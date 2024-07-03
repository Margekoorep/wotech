import java.util.Scanner;
import java.util.ArrayList;
import java. util. Random;
public class Main {
    public static void main(String[] args) {
        CheeseService cheeseService = new CheeseService();
        Scanner scanner = new Scanner(System.in);
        boolean shopOpen = true;
        System.out.println("Welcome to the Shop!");
        while (shopOpen) {
            System.out.println("If you wish to enter shop item management, please enter 1");
            System.out.println("To enter the shopping area, enter 2");
            System.out.println("To exit, enter 3");
            int userInput1 = scanner.nextInt();
            if (userInput1 == 1) {
                manageShop(scanner, cheeseService);

            } else if (userInput1 == 2) {
                System.out.println("Please create an account");
                createCustomer(cheeseService);
                shoppingArea(scanner, cheeseService);
            } else if (userInput1 == 3) {
                System.out.println("Goodbye!");
                shopOpen = false;
            } else {
                System.out.println("Please enter a valid option");
            }
        }
    }
    public static void createItem(CheeseService cheeseService) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the cheese ID");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Please input the name of the cheese");
        String name = scanner.nextLine();
        System.out.println("Please input the cost of cheese");
        int cost = scanner.nextInt();
        Item item = new Item(id, name, cost);
        cheeseService.addItem(item);
    }
    public static void createCustomer (CheeseService cheeseService){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int customerID = random.nextInt(1000, 9999);
        System.out.println("Please input your name ");
        String customerName = scanner.nextLine();
        customerName = customerName.toLowerCase();
        System.out.println("Please enter the amount of money you would like to add to your account ");
        int customerBalance = scanner.nextInt();
        Customer customer = new Customer(customerID, customerName, customerBalance);
        cheeseService.addCustomer(customer);
    }
    public static void manageShop(Scanner scanner, CheeseService cheeseService ) {
        boolean shopManagerActive = true;
        while (shopManagerActive) {
            System.out.println("To add cheese to store, enter 1");
            System.out.println("To remove cheese from store, enter 2");
            System.out.println("To update cheese in store, enter 3");
            System.out.println("To see the list of cheeses, enter 4");
            System.out.println("To exit, enter 5");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                createItem(cheeseService);
            } else if (userInput == 2) {
                System.out.println("Please enter the cheese ID you would like to remove");
                int itemId = scanner.nextInt();
                cheeseService.removeItem(itemId);
            } else if (userInput == 3) {
                System.out.println("Please enter the cheese ID you would like to update");
                int itemId2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter the new name for the cheese ");
                String newName = scanner.nextLine();
                System.out.println("Please enter the new price for the cheese ");
                int newCost = scanner.nextInt();
                cheeseService.updateItem(itemId2, newName, newCost);
            } else if (userInput == 4) {
                ArrayList<Item> items = cheeseService.getItems();
                for (Item item1 : items) {
                    System.out.println("Name: " + item1.getName() + ", price: " + item1.getCost() +"€");
                }
            } else if (userInput == 5) {
                System.out.println("You have exited the Shop!");
                shopManagerActive = false;

            }
        }
    }
    public static void shoppingArea(Scanner scanner, CheeseService cheeseService) {
        boolean shoppingActive = true;
        System.out.println("You have entered the Cheese shop!");
        while (shoppingActive) {
            System.out.println("\nTo add cheese to cart, enter 1");
            System.out.println("To remove cheese from cart, enter 2");
            System.out.println("To head to checkout, enter 3");
            System.out.println("To exit shop, enter 4");

            int userInput2 = scanner.nextInt();
            scanner.nextLine();
            if (userInput2 == 1) {
                System.out.println("Please enter the name of the cheese you would like to add to the cart");
                String chosenItem = scanner.nextLine();
                for (Item item : cheeseService.getItems()) {
                    if (item.getName().equals(chosenItem)) {
                        cheeseService.addItemToCart(item);
                        System.out.println("Added " + item.getName() + " to cart.");
                        break;
                    }
                }
            } else if (userInput2 == 2) {
                System.out.println("Please enter the Cheese ID you would like to remove from the cart");
                int chosenID = scanner.nextInt();
                cheeseService.removeFromCart(chosenID);
            } else if (userInput2 == 3) {
                System.out.println("You have chosen to head to checkout");
                System.out.println("To finalize your purchase enter your name: ");
                String name = scanner.nextLine().toLowerCase();
                var sum = cheeseService.checkout();
                ArrayList<Customer> customers = cheeseService.getCustomers();
                for (Customer customer1 : customers) {
                    if (customer1.getName().equals(name)) {
                        int balance = customer1.getBalance();
                        int customerBalance = balance - sum;
                        System.out.println("Your total is " + sum + "€");
                        if (customerBalance > 0) {
                            cheeseService.updateBalance(name, sum);
                            System.out.println("Your new balance is " + customer1.getBalance() + "€");

                        }else{
                            System.out.println("You do not have enough money for checkout.");
                        }
                    }
                }



            } else {
                System.out.println("You have exited the Shop!");
                shoppingActive = false;
            }
        }
    }
}

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
        this.itemName = name;
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
import java.util.ArrayList;

public class CheeseService {

    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Item> cart = new ArrayList<Item>();

    public ArrayList<Item> getItems(){
        return items;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
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
    public void updateBalance(String customerName, int sum) {

        for ( var customer : customers) {
            if (customer.getName().equals(customerName)){
                int balance = customer.getBalance();
                balance = balance - sum;
                customer.setBalance(balance);
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
public class Customer {
    private int customerId;
    private String customerName;
    private int customerBalance;

   public Customer(int id, String name, int balance) {
        this.customerId = id;
        this.customerName = name;
        this.customerBalance = balance;

    }
    public int getId(){
        return customerId;
    }
    public String getName(){
        return customerName;
    }
    public int getBalance() {
        return customerBalance;
    }
    public void setBalance(int balance) {
        this.customerBalance = balance;

    }
}
