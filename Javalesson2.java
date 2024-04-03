
public class Main {
  public static void main(String[] args) {


    // This is a string
    var text = "This is a random text";
    text = "this is another text";
    text = "March";

    // boolean - lightswitch
    var isDisabled = false;
    isDisabled = true;

    var number = 5;
    number = number + 7;

    //float,character - f lõpus on vajalik
    var interestingNumber = 100.5f;

    var mixedInterestingNumber = interestingNumber + number; 
    // number = mixedInterestingNumber -2; // + - * /

    System.out.println(text);
    System.out.println(isDisabled);
    System.out.println(interestingNumber);
    System.out.println(mixedInterestingNumber);


  }
}
 // groupwork
public class Main {
  public static void main(String[] args) {
    var name = "Anna"; // string
    name = "Laura"; // string
    var age = 25; //integer
    var student = true; //boolean
    var yearsStudied = 1;
    var yearsToStudy = 2;
    var totalStuding = yearsStudied + yearsToStudy;
    var bankAccountMoney = 15.23f; //float
    var savingsAccountMoney = 23.45f; //float
    var totalMoney = bankAccountMoney + savingsAccountMoney;

    var examMark = "A"; //character
    var pet = "cat"; //string
    var petName = "Amy The Gray"; //string


    System.out.println(name);
    System.out.println(name + " is " + age + " years old");
    System.out.println("Is "+ name + " studying? ");
    System.out.println(student);
    System.out.println("How much money is in " + name + "'s bank account? ");
    System.out.println(bankAccountMoney);
    System.out.println(name + " has " + savingsAccountMoney + " in her savings");  
      System.out.println(name +" has " + totalMoney + " in her bank account and savings");
    System.out.println("What is " + name + "'s exam mark? " + name+ " got an " +examMark);
    System.out.println("What is "+ name +"'s pet? It is a " +pet+" named "+ petName);

    student = false; // kuna see tuleb hiljem, siis muutub nüüd konsoolis "student false", nii kasutad boolean-i.
    System.out.println("Is "+ name + " still studying? " + student);

    System.out.println(name + " has studied for " + yearsStudied + " years, in total she needs to study for " + totalStuding + " years"); 

  }  
}
