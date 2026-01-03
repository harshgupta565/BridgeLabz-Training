package inheritance;

// Superclass
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear); // calling parent constructor
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // reuse book info
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryMangment {
    public static void main(String[] args) {
        Author book1 = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Expert in software craftsmanship"
        );

        book1.displayInfo();
    }
}

