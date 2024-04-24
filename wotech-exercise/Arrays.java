//Easy -> Initialize a string array and try to input and output data
// We want to define an array city names.
 //We want to add values to it (could be through the scanner, or just writing ```java
//arr[0] = "Riga";
//```java
//arr[0] = scanner.nextLine();

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] arr = new String[5];
    System.out.println("Enter 5 city names: ");
    arr[0] = scanner.nextLine();
    arr[1] = scanner.nextLine();
    arr[2] = scanner.nextLine();
    arr[3] = scanner.nextLine();
    arr[4] = scanner.nextLine();

    System.out.println("The city names are: " + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + ".");
    
     scanner.close();
  }
}


//Challenging -> Find the largest number in the array and find the smallest number in the array
// 1. input a array
// 2. find the largest number in the array
// 3. Find the smallest number in the array

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[5];
    System.out.print("Enter 5 numbers: ");
    for(int i = 0; i < arr.length; i++){ 
      arr[i] = scanner.nextInt();
    }
    
    int maxNumber = arr[0];
     for (int i = 0; i < arr.length; i++)
      if (arr[i] > maxNumber) {
        maxNumber = arr[i];     
    }
    System.out.println("The largest number is: " + maxNumber);

    int minNumber = arr[0];
    for (int i = 0; i < arr.length; i++)
      if (arr[i] < minNumber){
        minNumber = arr[i];
      }
    System.out.println("Smallest number is:" + minNumber);
    
     scanner.close();
  }
}


// ChatGTP exercises

//program that checks if an array of integers is sorted in ascending order? :

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[5];
    System.out.print("Enter 5 numbers: ");
    for(int i = 0; i < arr.length; i++){ 
      arr[i] = scanner.nextInt();
    }
    boolean isSorted = true;
  
    for (int i = 0; i < arr.length-1; i++){
      if (arr[i] > arr[i+1]){
     isSorted = false;
        break;
      }
    }
   if  (isSorted){
     System.out.println ("The array is in ascending order");
   } else{ 
  System.out.println ("The array is not in ascending order");

}
    
     scanner.close();
  }
}


// a program that calculates the sum and average of elements in an array of integers? And checks if there are negative numbers in array. 

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[5];
    System.out.print("Enter 5 numbers: ");
    for(int i = 0; i < arr.length; i++){ 
      arr[i] = scanner.nextInt();
    }

    var sumOfArray = 0;
    for (int i = 0; i < arr.length; i++) {
      sumOfArray += arr[i];
    }
    System.out.println("The sum of array is: " + sumOfArray);
    var averageOfArray = (double) sumOfArray / arr.length;
    System.out.println("The average of array is: " + averageOfArray);

    boolean foundNegative = false;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] < 0 ) {
        foundNegative = true;
        break;
      }
    }

    if (foundNegative) {
      System.out.print("The negative numbers are: ");
    for (int i = 0; i < arr.length; i++){
      if (arr[i] < 0 ){
        System.out.println(arr[i]);
      }
    }
    } else {
      System.out.println("There are no negative numbers in the array.");
      }
  
    
     scanner.close();
  }
}
 

// 

/*Fill the party list with people you would like to invite to the party.
Check whether or not "Anna" is in the array.
Check whether or not "Maris" is in the array.
["Oskars", "Anna", "Andris"]
Result: 
"Anna is in the party list"
"Maris is not in the party list"*/

  import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {  
    String[] arr ={"Oskars", "Anna", "Andris"};

    Boolean annaIsInList = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == "Anna") {
        annaIsInList = true;
        break;
      }  
    }
      boolean marisIsInList = false;
      for (int i = 0; i < arr.length; i++){
        if (arr[i] == "Maris"){
          marisIsInList = true;
      }
  }
   if (annaIsInList){
  System.out.println("Anna is in the party list");
   }else{
  System.out.println("Anna is not in the party list");
   }
  if (marisIsInList){
    System.out.println("Maris is in the party list");
  } else{
    System.out.println("Maris is not in the party list");
  }

  }
}

// Shorter version of previous exercise: 
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    

    String[] arr ={"Oskars", "Anna", "Andris"};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a name: ");
    String name = scanner.nextLine();
    
      Boolean nameIsInList = false;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals(name)) {
          nameIsInList = true;
          System.out.println(name + " is in the party list");
         break;
        }  
      }
    if (!nameIsInList){
    System.out.println(name + " is not in the party list");
     }
    
  }
    }

 /*
Given an array of integers, write a Java program to find the maximum sum of two integers in the array.

For example in an array like this:
[2, 3, 1, 5, 4]
The maximum sum would be 5 + 4

*/

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[5];
    System.out.print("Enter 5 numbers: ");
    for(int i = 0; i < arr.length; i++){ 
      arr[i] = scanner.nextInt();
    }
    int maxSum = arr[0] + arr[1];
    
    for (int i = 0; i < arr.length; i++){
      for (int j = i + 1; j < arr.length; j++){
        int maxSum2 = arr[i] + arr[j];
        if (maxSum2 > maxSum){
          maxSum = maxSum2;
        }  
      }
    }
    System.out.println("The maximum sum is: " + maxSum);
       scanner.close();
      }
    }
