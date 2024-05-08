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
