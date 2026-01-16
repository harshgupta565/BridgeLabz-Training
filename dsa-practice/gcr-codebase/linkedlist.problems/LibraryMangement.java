package linkedlist.problems;

import java.util.Scanner;

class Book {
    int bookID;
    String title;
    String author;
    String genre;
    boolean isAvailable;
    Book next;
    Book prev;

    public Book(int bookID, String title, String author, String genre, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class Library {
    private Book head;
    private Book tail;

    // Add book at end
    public void addBook(int bookID, String title, String author, String genre, boolean isAvailable) {
        Book newBook = new Book(bookID, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        System.out.println("Book added: " + title);
    }

    // Remove book by ID
    public void removeBook(int bookID) {
        if (head == null) {
            System.out.println("Library is empty!");
            return;
        }

        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                if (current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next; // Removing head

                if (current.next != null)
                    current.next.prev = current.prev;
                else
                    tail = current.prev; // Removing tail

                System.out.println("Book removed: " + current.title);
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID not found!");
    }

    // Search by title or author
    public void searchBook(String keyword) {
        Book current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.equalsIgnoreCase(keyword) || current.author.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + current.title + " by " + current.author +
                        " | Genre: " + current.genre +
                        " | Available: " + (current.isAvailable ? "Yes" : "No"));
                found = true;
            }
            current = current.next;
        }
        if (!found)
            System.out.println("No book found with keyword: " + keyword);
    }

    // Update availability status
    public void updateAvailability(int bookID, boolean status) {
        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = status;
                System.out.println("Updated availability of " + current.title + " to " + (status ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID not found!");
    }

    // Display books forward
    public void displayForward() {
        System.out.println("Library Books (Forward):");
        Book current = head;
        while (current != null) {
            System.out.println(current.bookID + ": " + current.title + " by " + current.author +
                    " | Genre: " + current.genre +
                    " | Available: " + (current.isAvailable ? "Yes" : "No"));
            current = current.next;
        }
    }

    // Display books in reverse
    public void displayReverse() {
        System.out.println("Library Books (Reverse):");
        Book current = tail;
        while (current != null) {
            System.out.println(current.bookID + ": " + current.title + " by " + current.author +
                    " | Genre: " + current.genre +
                    " | Available: " + (current.isAvailable ? "Yes" : "No"));
            current = current.prev;
        }
    }

    // Count total books
    public void countBooks() {
        int count = 0;
        Book current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Total books in library: " + count);
    }
}

public class LibraryMangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Sample menu for demonstration
        while (true) {
            System.out.println("\n1. Add Book\n2. Remove Book\n3. Search Book\n4. Update Availability\n5. Display Forward\n6. Display Reverse\n7. Count Books\n8. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Book ID: "); int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Title: "); String title = sc.nextLine();
                    System.out.print("Author: "); String author = sc.nextLine();
                    System.out.print("Genre: "); String genre = sc.nextLine();
                    System.out.print("Available (true/false): "); boolean available = sc.nextBoolean();
                    library.addBook(id, title, author, genre, available);
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: "); int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;
                case 3:
                    System.out.print("Enter Title or Author to search: "); String keyword = sc.next();
                    library.searchBook(keyword);
                    break;
                case 4:
                    System.out.print("Enter Book ID to update: "); int updateId = sc.nextInt();
                    System.out.print("Available (true/false): "); boolean status = sc.nextBoolean();
                    library.updateAvailability(updateId, status);
                    break;
                case 5:
                    library.displayForward();
                    break;
                case 6:
                    library.displayReverse();
                    break;
                case 7:
                    library.countBooks();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
