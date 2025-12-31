package oopsfundamental;
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println(accountNumber + " - " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 1001;
        s.accountHolder = "Neha";
        s.setBalance(5000);

        s.display();
        System.out.println("Balance: ₹" + s.getBalance());
    }
}
