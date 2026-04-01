abstract class BankAccount {
    private final String accountNumber; // immutable account number
    private final double balance;       // immutable balance

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public abstract double calculateFee();
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        // Fee is 0.5% of balance
        return getBalance() * 0.005;
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        // Flat 1.0 fee if balance < 1000, otherwise 0
        return getBalance() < 1000 ? 1.0 : 0.0;
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("12345", 1000.0);
        BankAccount checking1 = new CheckingAccount("54321", 1500.0);
        BankAccount checking2 = new CheckingAccount("98765", 500.0);
        BankAccount savings2 = new SavingsAccount("11111", 500.0);

        // Test outputs
        System.out.printf("Savings fee: %.2f%n", savings.calculateFee());      // 5.00
        System.out.printf("Checking fee (1500): %.2f%n", checking1.calculateFee()); // 0.00
        System.out.printf("Checking fee (500): %.2f%n", checking2.calculateFee());  // 1.00
        System.out.printf("Savings fee (500): %.2f%n", savings2.calculateFee());    // 2.50
    }
}

