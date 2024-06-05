import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    ArrayList<Book> bookShelf = new ArrayList<Book>();
    var scanner = new Scanner(System.in);
    System.out.println("Welcome to the Bookshelf!");
    boolean active = true;
    while(active){
    System.out.println("Please choose what you would like to do next:\n1 - add a book to the shelf\n2 - remove a book from the shelf\n3 - get a book from shelf\n4 - quit");
    var input = scanner.nextLine();
       
      if (input.equals("1")){
        System.out.println("Please enter the title of the book");
        var title = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        var author = scanner.nextLine();
        bookShelf.add (new Book(title, author));
      }
        
      else if (input.equals("2")){
        System.out.println("Please enter the title of the book you would like to remove");
        var title = scanner.nextLine();
        System.out.println("Please enter the author of the book you would like to remove");
        var author = scanner.nextLine();
        bookShelf.remove(new Book(title, author));

        
      }else if (input.equals("3")){
        System.out.println("Please enter the title of the book you would like to get");
        var title = scanner.nextLine();
        System.out.println("Please enter the author of the book you would like to get");
        var author = scanner.nextLine();
        var book = bookShelf.stream().filter(b -> b.title.equals(title) && b.author.equals(author)).collect(Collectors.toList());
        System.out.println(book);
      }else if (input.equals("4")){
        active = false;
        System.out.println("Thank you for using the Bookshelf!");
      }
        
    }
    
  }
}




