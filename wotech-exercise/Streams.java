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
