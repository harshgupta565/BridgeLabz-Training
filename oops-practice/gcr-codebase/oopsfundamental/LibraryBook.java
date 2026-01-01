package oopsfundamental;

class LibraryBook {

    // static variable
    static String libraryName = "Egmore Library";

    // instance variables
    String title;
    String author;
    final String isbn; // final variable

    // constructor using this
    LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // instance method
    void displayDetails(Object obj) {
        if (obj instanceof LibraryBook) {
            LibraryBook b = (LibraryBook) obj;
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook(
                "Effective Java",
                "Joshua Bloch",
                "978-0134685991"
        );

        displayLibraryName();
        book.displayDetails(book);
    }
}
