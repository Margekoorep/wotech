// THIS IS THE MAIN.JAVA CODE
import java.util.Scanner;
public class Main {
    public static TaskManager taskManager = new TaskManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Hello!  Welcome to the book application called The Bookshelf.\nHere you can add books to your shelf, remove books from the shelf or look at your book collection.\nLets get started!");
        System.out.println();
        while(!exit) {
            System.out.println("To add a book to the shelf type - 1\nTo remove a book from the shelf type - 2\nTo see  your books on the The Shelf type - 3.\nTo exit the application type - 4");

            var choiceOfAction = scanner.nextLine();
            System.out.println();
            switch(choiceOfAction){
                case "1":
                createBook();
                break;
                case "2":
                removeBook();
                break;
                case "3":
                showBookList();
                    System.out.println();
                break;
                case "4":
                exit = true;
                System.out.println("Thank you for using The Bookshelf!");
                break;
                default:
                System.out.println("Please enter a valid option!");
                System.out.println();
                break;
            }
        }
        scanner.close();
    }
    public static void createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book");
        var title = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        var author = scanner.nextLine();
        var book = new Book(title, author);
        taskManager.addBook(book);
    }
    public static void removeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book you would like to remove");
        var title = scanner.nextLine();
        System.out.println("Please enter the author of the book you would like to remove");
        var author = scanner.nextLine();
        System.out.println();
        var book = new Book(title, author);
        taskManager.removeBook(book);
    }
    public static void showBookList(){
        var books = taskManager.getBooks();
        System.out.println("The books in the shelf are:");
        for (var book : books){
            System.out.println(book.title + " by " + book.author);

        }
    }
}

//THIS IS THE BOOK.JAVA CODE

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
       this.title = title;
       this.author = author;
    }
    // The equals and hashCode part is done by ChatGPT to fix the problem of books not being deleted.
    // I tried to understand it but it was difficult
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}


// THIS IS THE TASKMANAGER.JAVA CODE

import java.util.ArrayList;
public class TaskManager {
    private ArrayList<Book> books= new ArrayList<Book>();
    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public void removeBook(Book book){
        books.remove(book);
    }
}
