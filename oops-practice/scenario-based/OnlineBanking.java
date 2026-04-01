class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// Abstraction using Interface
interface BankService {
    void checkBalance();
    void transferMoney(double amount) throws InsufficientBalanceException;
}

// Abstract Account class (OOP + Inheritance base)
abstract class Account implements BankService {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Polymorphism
    abstract double calculateInterest();

    public void checkBalance() {
        System.out.println("Account " + accountNumber + " Balance: ₹" + balance);
    }
}

// Savings Account
class SavingsAccount extends Account {

    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }

    // synchronized for multithreading safety
    public synchronized void transferMoney(double amount)
            throws InsufficientBalanceException {

        if (balance < amount)
            throw new InsufficientBalanceException("Insufficient Balance in Savings Account");

        balance -= amount;
        System.out.println("₹" + amount + " transferred from Savings Account");
    }
}

// Current Account
class CurrentAccount extends Account {

    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.01; // 1% interest
    }

    public synchronized void transferMoney(double amount)
            throws InsufficientBalanceException {

        if (balance < amount)
            throw new InsufficientBalanceException("Insufficient Balance in Current Account");

        balance -= amount;
        System.out.println("₹" + amount + " transferred from Current Account");
    }
}

// Multithreading Class
class Transaction extends Thread {
    Account account;
    double amount;

    Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        try {
            account.transferMoney(amount);
            account.checkBalance();
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Main Class
public class OnlineBanking {
    public static void main(String[] args) {

        // Account Creation (CRUD - Create)
        Account acc = new SavingsAccount(101, 5000);

        // Read
        acc.checkBalance();

        // Polymorphism
        System.out.println("Interest: ₹" + acc.calculateInterest());

        // Concurrent Transactions (Multithreading)
        Transaction t1 = new Transaction(acc, 2000);
        Transaction t2 = new Transaction(acc, 3000);

        t1.start();
        t2.start();
    }
}
