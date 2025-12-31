package oopsfundamental;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor (same name as class)
    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book already borrowed");
        }
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java OOP", "Sun", 350);
        b.borrowBook();
        b.borrowBook();
    }
}
