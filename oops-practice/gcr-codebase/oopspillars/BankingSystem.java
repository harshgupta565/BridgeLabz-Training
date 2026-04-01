package oopspillars;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public abstract double calculateInterest();

    public String getDetails() {
        return accountNumber + " | " + holderName + " | Balance: " + balance;
    }
}

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", "Harsh", 10000);
        BankAccount acc2 = new CurrentAccount("CA201", "Amit", 20000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            System.out.println(acc.getDetails());
            System.out.println("Interest: " + acc.calculateInterest());
            System.out.println();
        }
    }
}
