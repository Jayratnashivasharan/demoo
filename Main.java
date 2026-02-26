import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ")";
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    // Remove book
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Removed: " + book);
    }

    // Display all books
    public void showBooks() {
        System.out.println("Books in library:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "John Doe", "12345");
        Book b2 = new Book("Data Structures", "Jane Smith", "67890");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.showBooks();

        lib.removeBook(b1);
        lib.showBooks();
    }
}