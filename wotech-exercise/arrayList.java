import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    /*Easy: Create an arrayList for integers
Add 5 numbers.

Filter the arrayList and print out only numbers that divide by 2 
(number % 2 == 0)*/  
      var numbersList = new ArrayList<Integer>();
      var scanner = new Scanner(System.in);
      int counter = 0;
    while (counter < 5){
      System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        counter = counter + 1;      
      addNumber(numbersList, number);
    }
      
      printArrayList(numbersList);

    // filtering 
    var filteredNumbersList = new ArrayList<Integer>();
    for(int number: numbersList){
      if (number % 2 ==0 ){
        filteredNumbersList.add(number);
      }
    }
    printArrayList(filteredNumbersList);
  
  }
  public static void printArrayList(ArrayList<Integer> numbers){
    System.out.println("List has these numbers: ");
    for (int number: numbers){
      System.out.println(number);
    }
  }
  public static void addNumber(ArrayList<Integer> numbers, int number ){
    numbers.add(number);  
    System.out.println(number + " has been added to the list.");
  }
}

________________________________________________________

  import java.util.ArrayList;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    /*
Medium: Put 100 random numbers in arrayList
Filter the arrayList and print out only numbers that divide by 2 
(number % 2 == 0)*/
    
      var numbersList = new ArrayList<Integer>();
      Random rand = new Random();
      int counter = 0;
    while (counter < 101){  //adding 100 random numbers
      int randNumber = rand.nextInt(101); // choosing from 0-100
      counter = counter + 1;      
      addNumber(numbersList, randNumber);
    }
    // making a new list of filtered numbers
      var filteredNumbersList = new ArrayList<Integer>();
    for(int randNumber: numbersList){
      if (randNumber % 2 ==0 ){
        addNumber(filteredNumbersList, randNumber);
      }
    }
    // printing filtered list
    printArrayList(filteredNumbersList);
  }
  public static void printArrayList(ArrayList<Integer> numbers){
    System.out.println("List has these numbers: ");
    for (int number: numbers){
      System.out.println(number);
    }
  }
  public static void addNumber(ArrayList<Integer> numbers, int number ){
    numbers.add(number);  
  }
}



