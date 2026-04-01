package inheritance;

// Parent class
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Child class 1
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Child class 2
class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account");
        System.out.println("Daily Withdrawal Limit: " + withdrawalLimit);
    }
}

// Child class 3
class FixedDepositAccount extends BankAccount {
    int lockInYears;

    FixedDepositAccount(String accountNumber, double balance, int lockInYears) {
        super(accountNumber, balance);
        this.lockInYears = lockInYears;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account");
        System.out.println("Lock-in Period: " + lockInYears + " years");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA1001", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA2001", 30000, 5);
        FixedDepositAccount fd = new FixedDepositAccount("FD3001", 100000, 3);

        savings.displayAccountType();
        System.out.println();

        checking.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}
