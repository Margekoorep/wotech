Main.java --> // getting user input, sending this input to tsakmanager, show information to the user
Taskmanager.java -->// add tasks to the list, mark them done and get list
Task.java --> // template for task (name, description, date isItDone)
// MVP : Minimal Viable Product
   // encapsulation OOP

   
  // be able to add task
  // have a list of all tasks 
  // set task done, by Task name
  
  // BONUS:
  // list of undone tasks - filter
  //list of done tasks- filter
  // get a randome quote to stop procrastinating


   MAIN: 
   
import java.util.stream.Collectors;
import java.util.List;
import java.util.Scanner; // only in Main
// System.out println - also only in Main
// static is used only in Main


public class Main { // Main is like User interference -UI
  public static TaskManager taskManager = new TaskManager(); // scope is out of main class
  public static void main(String[] args) {

    createTask();
    showTodoList();
    // use scanner, 
    //put in While loop
    //if user presses 1 we call create task
    // if user presses 2, we call showTodoList
    // if user press 3, mark task is done true
    // if usre presses x Close the loop
    
    
      
  }
  public static void createTask(){
    Scanner scanner = new Scanner (System.in);
    
    // input the task name
    System.out.println("Pease eneter the name of the task");
    var name = scanner.nextLine();
    
    // input the task description
    System.out.println("Please enter the description of the task.");
    var description = scanner.nextLine();
    scanner.close();
    var task = new Task(name, description);
    taskManager.addTask(task);
  }
  public static void showTodoList(){
    var tasks = taskManager.getTasks();
    for (var task : tasks){
      System.out.println("This is a TASK");
      System.out.println(task.name);
      System.out.println(task.description);
      System.out.println(task.isDone);
    }
  }
}




TASK: 


// template for task (f.ex name, description, date isItDone)
public class Task{
  public String name;
  public String description;
  public boolean isDone; // we will add later-right now is false because it's default value is false!
  
// var task = new Task(name, description);
  public Task (String name, String description){
    this.name = name;
    this.description = description;
  }
}

TASKMANAGER: 

// add tasks to the list, mark them done and get list
import java.util.ArrayList;
public class TaskManager{
  // MVP : Minimal Viable Product
  // be able to add task - DONE
  // have a list of all tasks - getTasks();
  // set task done, by Task name
private ArrayList<Task> tasks= new ArrayList<Task>();

// because we want to use default constructor// new TaskManager() - we don't need to ass cutsom constructor

  public void addTask(Task task){
    tasks.add(task);
  }
  
  // getter is a function we write that provides a value to user
  public ArrayList<Task> getTasks(){
    return tasks;
  }
  
  // BONUS:
  // list of undone tasks - filter
  //list of done tasks- filter
  // get a randome quote to stop procrastinating
}

