//MAIN: 
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    var book = new Book("The Hobbit","J.R.R. Tolkien",310);
    var book2 = new Book("The Lord of the Rings","J.R.R. Tolkien",1100);
    var book3 = new Book("The Silmarillion","J.R.R. Tolkien",1000);
   

    System.out.println(book.title);
    System.out.println(book2.author);
    System.out.println(book3.pageCount);
    
    
  }
}




// NEW CLASS:

public class Book{
  public String title;
  public String author;
  public int pageCount;

  public Book(String title, String author, int pageCount){
    this.title = title;
    this.author = author;
    this.pageCount = pageCount;
  }
}
