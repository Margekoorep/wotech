public class Main {
public static void main(String[] args) {


System.out.println("Good morning!");
// door that has 1 lock - boolean
  boolean isDoorLocked = false;

  if(isDoorLocked) {
    System.out.println("Door is closed");
  } else {
    System.out.println("Door is open!");
  }

// new example 1
String name = "Oskars";
String name1 = "Elchin";
String name2 = "Anna";

boolean isElchin = name == name1; // if the name = Elchin then it is a boolean - true
boolean isAnna = name == name2; // is false because name != Anna
//boolean isInvited = isElchin || isAnna;


  if( isElchin || isAnna) { 
    // Guard if the name is Elchin or Anna let them in 
  System.out.println ("You are invited");
  }else{
    System.out.println("Next time");
  }

// new example 2
  int yearOfSchool = 12;
  String studentName = "Anna";
  double studentAge = 19;
  double grade = 6;
  boolean olympicsWinner = true; 

// our condition
// Student age  must be 18 or older AND grade must be more or equal to 8
// OR must win some olympiad
boolean isAgeEligible = studentAge >= 18;
boolean isGradeEligible = grade >= 8;




if(isAgeEligible && (isGradeEligible || olympicsWinner)){
  System.out.print("You are invited");
} else {
  System.out.print("You are not accepted. Reasons: ");
}


// ChatGtp example of more info 

if (!isAgeEligible) {
  System.out.println("- You are not eligible due to age.");
}
if (!isGradeEligible && !olympicsWinner) {
  System.out.println("- You are not eligible due to insufficient grade.");
}
if (!olympicsWinner && isAgeEligible && !isGradeEligible) {
  System.out.println("- You are not eligible due to not being an Olympics winner.");
}
// when using  || (or) it results  
// F || F = F
// T || F = T
// F || T = T
// T || T = T

// when using && (and) it results
// F && F = F
// F && T = F
// T && F = F
// T && T = T
}
}

// HOME WORK 



//AND
  boolean isKey1UnLocked = true;
  boolean isKey2UnLocked = true;

  if(isKey1UnLocked && isKey2UnLocked) {
    System.out.println("Both doors are unlocked. Door is open");
  }else{
    System.out.println("access denied");
  }

  String username = "CatsAreCool";
  String password = "DogsDrool12";

  if(username.equals("CatsAreCool") && password.equals("DogsDrool12")){
    System.out.println("You are logged in");
    } else {
    System.out.println("access deniend");
    }
// OR
boolean eggsOnSale = true;
  double eggPrice = 2.50;

if(eggsOnSale || eggPrice <2.50){
  System.out.println("Buy the eggs");
} else {
  System.out.println("Don't buy the eggs");
}
  boolean weatherIsShini = true;
  boolean enoughEnergy = true;

  if(weatherIsShini || enoughEnergy){
    System.out.println("Go running");
  } else {
    System.out.println("Stay home");
  }
  // AND & OR

  boolean isThereShrimp = true;
  boolean isThereSquid = true;
  boolean isThereWhiteWine = true;
  boolean isWaitressNotRude  = false;

  if((isThereShrimp || isThereSquid) && isThereWhiteWine && !isWaitressNotRude){
    System.out.println("I'll go to the restaurant");
  } else {
    System.out.println("I'll stay home");
  }
