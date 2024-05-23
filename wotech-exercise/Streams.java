// Easy: Easy: Create an arrayList for integers. Add 5 numbers.

import java.util.ArrayList;
import java.util.stream.Collectors;
public class Main {
  public static void main(String[] args) {


     var numbersList = new ArrayList<Integer>();
    numbersList.add(1);
    numbersList.add(2);
    numbersList.add(3);
    numbersList.add(4);
    numbersList.add(5);
    numbersList.add(6);
    numbersList.add(7);
    numbersList.add(8);
    numbersList.add(9);
    numbersList.add(10);

    var filteredNumbers = numbersList
    .stream()
    .skip(5) 
    .forEach(x -> System.out.println( x))  
  }
}

_______________________________________
 /* Medium: Medium: Create an integer ArrayList,
 make sure they divide by 2, skip the first 5, limit to three and print them out from another function.*/

 import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
public class Main {
  public static void main(String[] args) {


    var numbersList = new ArrayList<Integer>();
      Random rand = new Random();
      int counter = 0;
    while (counter < 30){  //adding 30 random numbers to my list
      int randNumber = rand.nextInt(101); // choosing from 0-100
      counter = counter + 1;      
      addNumber(numbersList, randNumber);
    }

    var filteredNumbers = numbersList
    .stream()
    .filter(x -> x % 2 == 0) // filtering out the ones that divide by 2
    .skip(5) // skiping first 5 numbers
    .limit(3) // limiting to 3 numbers
    .collect(Collectors.toList()); // collecting to new list

    printList(filteredNumbers); // printing out the new list
  }
  
  public static void addNumber(ArrayList<Integer> numbers, int number ){
    numbers.add(number);  
  }
  public static void printList (List<Integer> numbers){
    System.out.println(numbers);
  }
}
