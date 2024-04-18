// Arrays 

// using user input for numbers. 

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] arr = new int[5];

    for(int i = 0; i < arr.length; i++){ //[0], [1], [2]
      arr[i] = scanner.nextInt();
    }
    
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
 scanner.close();
  }
}

/7 longer version import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      // ARRAYS- collection of specific data types - lists
      
      //int [] arr = {5, 7, 9};


      Scanner scanner = new Scanner(System.in); 
      System.out.println("Write a number");
       
      
      int [] arr = new int[5]; // creates new array that is 5 intergers long
      arr[0] = scanner.nextInt();
      arr[1] = scanner.nextInt();
      arr[2] = scanner.nextInt();
      arr[3] = scanner.nextInt();
      arr[4] = scanner.nextInt();

    
      
      //System.out.println(arr[0]);
      //System.out.println(arr[arr.length -1]);

      // using for loop to optimize code, instead using 5 sys.out.println I can use one.
      for (int i = 0; i < arr.length; i++){  
        System.out.println(arr[i]);
      }
       scanner.close();
  
}
}

// Not using user input. 

public class Main {
  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 5;
    arr[1] = 7;
    arr[2] = 9;
    arr[3] = 12;
    arr[4] = 15;

    
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

  }
}

// version 2 

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

      int[] arr = {5, 7 , 9};
    
      System.out.println(arr[0]);

  }
}


// FOR loop and arrays
//user is providing a number, Check if number is in array
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    
    
    int[] numbers = {1, 3, 4, 2, 8};
    
    System.out.println("Please write your favourite digit: ");
    Scanner scanner = new Scanner(System.in);
    int favouriteNumber = scanner.nextInt();

    boolean isFound = false;

    for (int i = 0; i < numbers.length; i++){
      if (numbers [i] == favouriteNumber){
        isFound = true;
        break;
      }
    }
      if (isFound){
        System.out.println("Your favourite number " + favouriteNumber + " is in the array");
      }else{
        System.out.println("Your favourite number " + favouriteNumber + " is not in the array");
    }
    scanner.close();
  }
}
