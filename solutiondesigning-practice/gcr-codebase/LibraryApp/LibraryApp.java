package LibraryApp;

import java.util.*;

//  Observer
interface Observer {
    void update(String message);
}

//  User
interface User extends Observer {
    void showRole();
}

//  User Implementations
class Student implements User {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Student.");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

class Faculty implements User {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Faculty.");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

class Librarian implements User {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Librarian.");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

//  Factory
class UserFactory {
    public static User createUser(String type, String name) {
        if (type.equalsIgnoreCase("student"))
            return new Student(name);
        else if (type.equalsIgnoreCase("faculty"))
            return new Faculty(name);
        else if (type.equalsIgnoreCase("librarian"))
            return new Librarian(name);
        else
            throw new IllegalArgumentException("Invalid user type");
    }
}

//  Builder
class Book {
    private String title;
    private String author;
    private String edition;
    private String genre;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.edition = builder.edition;
        this.genre = builder.genre;
    }

    public String getTitle() {
        return title;
    }

    static class BookBuilder {
        private String title;
        private String author;
        private String edition;
        private String genre;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

//  Singleton + Observer
class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null)
            instance = new LibraryCatalog();
        return instance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addBook(Book book) {
        books.add(book);
        notifyUsers(book.getTitle());
    }

    private void notifyUsers(String bookName) {
        for (Observer o : observers) {
            o.update("New book available: " + bookName);
        }
    }
}

//  Main
public class LibraryApp {
    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory
        User student = UserFactory.createUser("student", "Alice");
        User faculty = UserFactory.createUser("faculty", "Dr. Bob");

        student.showRole();
        faculty.showRole();

        // Observer registration
        catalog.addObserver(student);
        catalog.addObserver(faculty);

        // Builder
        Book book = new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();

        // Trigger notification
        catalog.addBook(book);
    }
}

