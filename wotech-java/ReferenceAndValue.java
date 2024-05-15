
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    // reference type vd value type
   
    int number = 20;
    number = changeNumber(number);
    System.out.println(number);
    int numberVoid = 20;
    changeNumberVoid(numberVoid);
    System.out.println(numberVoid);
    
  }
  public static int changeNumber(int number) {
      number = 55;
      return number;
    }

  public static void changeNumberVoid(int number) {
      number = 55;// this number will not change numberVoid value!
      
    }
}


____________________________________________________________________________

  

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    // reference type vs value type
    /* for value types you need to reassigne the value and use return. But for array (reference type) we do not have to use return to reassign the value*/
   
   int [] array = {1,2,3,4,5};
    array = changeArray(array);
   printOutArray(array);

    int [] arrayVoid ={1,2,3,4,5};
    changeArrayVoid(arrayVoid);
      printOutArray(arrayVoid);
    
      
    }
  public static int [] changeArray(int [] array){
      for (int i=0; i<array.length; i++){
        array [i]= 0;
       }  
      return array;
    }
  
  public static void changeArrayVoid(int [] array){
      for (int i=0; i<array.length; i++){
        array [i]= 1;
       }  
  }

  
  public static void printOutArray(int [] array){
      for (int i=0; i<array.length; i++){
        System.out.println(array[i]);
      }
  }
}

_____________________________________________________-
  public class Main {
  public static void main(String[] args) {
    // reference type vs value type
    
    int [] arrayVoid ={1,2,3,4,5};

    int [] array = arrayVoid;
    array[0] = 100;
      printOutArray(arrayVoid);
      
    }


  public static void printOutArray(int [] array){
      for (int i=0; i<array.length; i++){
        System.out.println(array[i]);
      }
  }
}

    /* when creating 2 arrays they are not same. When we int [] array2 = arrayVoid; they are same. 
      like 2 napkins they are 2 different things but their values are same. 
      Like there can be 2 Mari Mets but they are not same person. 
      They can have same hair or eyes but they are not same. Reference tyes:  if we change of an arry in method
      then it remains changed everywhere until we cahnge it again. ARRAYS HAVE IDENTITIES! */
