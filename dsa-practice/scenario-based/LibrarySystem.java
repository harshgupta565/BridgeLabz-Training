
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

class BookShelf {
    HashMap<String, LinkedList<String>> shelf;
    HashSet<String> allBooks;

    BookShelf() {
        shelf = new HashMap<>();
        allBooks = new HashSet<>();
    }

    void addBook(String genre, String book) {
        if (allBooks.contains(book)) {
            System.out.println(book + " already exists");
            return;
        }

        shelf.putIfAbsent(genre, new LinkedList<>());
        shelf.get(genre).add(book);
        allBooks.add(book);

        System.out.println(book + " added in " + genre);
    }

    void removeBook(String genre, String book) {
        if (!shelf.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        if (shelf.get(genre).remove(book)) {
            allBooks.remove(book);
            System.out.println(book + " removed");
        } else {
            System.out.println(book + " not found");
        }
    }

    void showShelf() {
        if (shelf.isEmpty()) {
            System.out.println("Shelf empty");
            return;
        }

        for (String genre : shelf.keySet()) {
            System.out.print(genre + " : ");
            for (String book : shelf.get(genre)) {
                System.out.print(book + " ");
            }
            System.out.println();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        BookShelf b = new BookShelf();

        b.addBook("Fiction", "BookA");
        b.addBook("Fiction", "BookB");
        b.addBook("Science", "BookC");
        b.addBook("Fiction", "BookA");

        b.showShelf();

        b.removeBook("Fiction", "BookB");
        b.removeBook("Science", "BookX");

        b.showShelf();
    }
}
