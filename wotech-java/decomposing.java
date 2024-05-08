/*
Find our place in the array:
1. Go through the array
2. find the number less then our number - if 
3. return indeks
4. increment indeks by 1 
5 if we can't find the number that is less than our number then return toatal count +1.*/
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    int [] arr = {8, 7, 5 ,3, 2, 1}; // current race result
    int number = 4; // our result
    boolean thePlaceIsFound = false;
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < number){
          i = i + 1;
          System.out.println("Our place in race: " + i);
          thePlaceIsFound = true;
          break;
        }
    }
    if(thePlaceIsFound == false){
      System.out.println("Our place in race: " + (arr.length + 1));
    }
    
  }
}

// Using function to make code better and easier to read: 

public class Main {
  public static void main(String[] args) {
    int [] arr = {8, 7, 5 ,3, 2, 1}; // current race result
    int number = 0; // our result
    int place = getThePlace (arr, number);
    System.out.println("Our place is: " + place);
    // one should use scanner and print out line in Main method
    }
    
  // using fuction to make code shorter and easier to read
  public static int getThePlace(int [] arr, int number){ 
    // returns an integer
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < number){
        return i + 1;
      }
  }
    return arr.length + 1;
  }
}

_______________________________________________________________________________

  /*Detect prime numbers:

Prime number divides only itself or one for exmple 7. 

Figure out algorythm that cheks if number is prime or not. 

6?
6/1=6
6/2=3
6/3=2...

5?
5/1=5
5/2=2.5 
5/3=1.6...
In order to find out if a number is prime we neet to didvde with all numbers untill the number. 7 beed 1 to 7.

1. Go through the nubers fron 2 to number -1
2. Check weather or not it is dividabel (number % (7/ it is modulus) i == 0)

3. if the 2nd point is true then it is not prime
4. if the 2nd is false it is a prime*/

public class Main {
  public static void main(String[] args) {
  boolean isAprimeNumber = isPrime (5);
    System.out.println(isAprimeNumber);
   
  }
  public static boolean isPrime(int number){
    for(int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      }
    }
    return true;
  }
  
}

// numbers from 0-100
public class Main {
  public static void main(String[] args) {
 

    for(int i = 0; i <100; i++){
      boolean isAPrimeNumber = isPrime(i);
      System.out.println(i + " is a prime number " + isAPrimeNumber);
    }
   
  }
  public static boolean isPrime(int number){
    for(int i = 2; i < number; i++){
      if (number % i == 0){
        return false;
      }
    }
    return true;
  }
  
}

  
