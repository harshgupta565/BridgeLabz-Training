package DigitalWallet;
import java.util.*;

// ---------- Custom Exception ----------
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// ---------- OOP Classes ----------
class User {
    int userId;
    String name;
    Wallet wallet;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.wallet = new Wallet();
    }
}

class Wallet {
    double balance;
    List<Transaction> transactions = new ArrayList<>();

    void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount));
    }

    void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
    }
}

class Transaction {
    String type;
    double amount;
    Date date;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }
}

// ---------- Interface ----------
interface TransferService {
    void transfer(User from, User to, double amount) throws InsufficientBalanceException;
}

// ---------- Polymorphism ----------
class WalletToWalletTransfer implements TransferService {
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.wallet.withdrawMoney(amount);
        to.wallet.addMoney(amount);
        System.out.println("Wallet to Wallet transfer successful");
    }
}

class BankTransfer implements TransferService {
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {
        from.wallet.withdrawMoney(amount);
        to.wallet.addMoney(amount);
        System.out.println("Bank transfer successful");
    }
}

// ---------- Main Class ----------
public class DigitalWalletSystem {
    public static void main(String[] args) {

        User user1 = new User(1, "Harsh");
        User user2 = new User(2, "Rohit");

        user1.wallet.addMoney(5000);

        TransferService transferService = new WalletToWalletTransfer(); // Polymorphism

        try {
            transferService.transfer(user1, user2, 2000);

            System.out.println("User1 Balance: " + user1.wallet.balance);
            System.out.println("User2 Balance: " + user2.wallet.balance);

            System.out.println("\nUser1 Transactions:");
            for (Transaction t : user1.wallet.transactions) {
                System.out.println(t.type + " - " + t.amount + " - " + t.date);
            }

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

