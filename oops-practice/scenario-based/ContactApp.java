import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InvalidPhoneNumberException extends Exception {
    InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Contact class
class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

// Contact Manager class
class ContactManager {

    List<Contact> contacts = new ArrayList<>();

    // Add contact
    void addContact(String name, String phone) throws InvalidPhoneNumberException {

        // check phone number length
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");
        }

        // check duplicate
        for (Contact c : contacts) {
            if (c.phone.equals(phone)) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }

        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully");
    }

    // Delete contact
    void deleteContact(String phone) {
        for (Contact c : contacts) {
            if (c.phone.equals(phone)) {
                contacts.remove(c);
                System.out.println("Contact deleted successfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    // Search contact
    void searchContact(String phone) {
        for (Contact c : contacts) {
            if (c.phone.equals(phone)) {
                System.out.println("Name: " + c.name + ", Phone: " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }
}

// MAIN CLASS
public class ContactApp {

    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        try {
            manager.addContact("Rahul", "9876543210");
            manager.addContact("Amit", "1234567890");

            // duplicate
            manager.addContact("Ravi", "9876543210");

            // invalid phone number
            manager.addContact("Neha", "12345");

        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }

        manager.searchContact("9876543210");
        manager.deleteContact("1234567890");
        manager.searchContact("1234567890");
    }
}
