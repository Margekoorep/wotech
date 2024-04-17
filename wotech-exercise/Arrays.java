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
