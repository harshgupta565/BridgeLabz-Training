package oopspillars;
abstract class LibraryItem {
    int itemId;
    String title;
    String author;

    LibraryItem(int id, String t, String a) {
        itemId = id;
        title = t;
        author = a;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println(itemId + " " + title + " " + author);
    }
}

interface Reservable {
    void reserveItem();
}

class Book extends LibraryItem implements Reservable {

    Book(int id, String t, String a) {
        super(id, t, a);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book reserved");
    }
}

class Magazine extends LibraryItem {

    Magazine(int id, String t, String a) {
        super(id, t, a);
    }

    int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {

    DVD(int id, String t, String a) {
        super(id, t, a);
    }

    int getLoanDuration() {
        return 3;
    }

    public void reserveItem() {
        System.out.println("DVD reserved");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        LibraryItem b = new Book(1, "Java", "James");
        LibraryItem m = new Magazine(2, "Tech", "Editor");
        LibraryItem d = new DVD(3, "OOP", "Oracle");

        b.getItemDetails();
        System.out.println(b.getLoanDuration());

        m.getItemDetails();
        System.out.println(m.getLoanDuration());

        d.getItemDetails();
        System.out.println(d.getLoanDuration());
    }
}
