ArrayList<Person> persons = new ArrayList<Person>();

//NEW CLASS
public class Person {
    public String name;
    public String surname;

    // new Person("Oskars, "Klaumanis");
  //This is a constructor
  // Constructor always launches when you create a new object -> new Person(name, surname);
  // constructor is a function, that is called when an object is created?
  // You can provide values to constructor
  public Person(String inputName, String inputSurname){
    name = inputName;
    surname = inputSurname;
  }
  public Person(){
    
  }
}

//AND MAIN

  import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    /* classes*/
    // new -creates  a instance
    // sys.outln and scanner only in Main
    //Class should have 1 functionality and work one locic


    
    Person person = new Person("Oskars", "Klaumanis");

    Person person2 = new Person();
    person2.name = "Elchin";
    person2.surname = "Datorium";


    System.out.println(person.name);
    System.out.println(person2.name);

    
  }
}

// LESSON 2

MAIN.JAVA

    import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Student.studentCount = 10;
  
    Student student = new Student();
    student.name = "John";
    Student student2 = new Student();

    System.out.println(student2.name);
    System.out.println(student.studentCount);
    System.out.println(student2.studentCount);
    System.out.println(Student.studentCount);
   
  }
}


STUDENT.JAVA

    public class Student{
  public static int studentCount = 0; // because it is static it is a global vareable that every one can use. and it belongs to the Student class. From now on don't use static :D 
  public String name;
  public int age;
  
  
}






