package SmartSelf;

import java.util.*;

// ---------- Book Class ----------
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

// ---------- SmartShelf Class ----------
class SmartShelf {
    List<Book> bookList = new ArrayList<>();

    // Add a book and keep list sorted (Insertion Sort)
    void addBook(Book newBook) {
        bookList.add(newBook);

        // Insertion Sort (stable)
        for (int i = 1; i < bookList.size(); i++) {
            Book key = bookList.get(i);
            int j = i - 1;

            // Compare titles alphabetically
            while (j >= 0 && bookList.get(j).title.compareToIgnoreCase(key.title) > 0) {
                bookList.set(j + 1, bookList.get(j));
                j--;
            }
            bookList.set(j + 1, key);
        }

        System.out.println("Book added: " + newBook.title);
    }

    // Display all books
    void displayBooks() {
        System.out.println("\nSmartShelf Book List:");
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}

// ---------- Main Class ----------
public class SmartShelfDemo {
    public static void main(String[] args) {
        SmartShelf shelf = new SmartShelf();

        shelf.addBook(new Book("Java Programming", "Harsh Gupta"));
        shelf.addBook(new Book("Algorithms", "CLRS"));
        shelf.addBook(new Book("Data Structures", "Schaum"));
        shelf.addBook(new Book("Python Basics", "John Doe"));

        shelf.displayBooks();
    }
}
