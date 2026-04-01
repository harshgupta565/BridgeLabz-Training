package objectsandclass;
class BankAccount {
    double balance = 700;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdraw amount is : " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println("Current balance: " + b.balance);
        b.deposit(200);
        b.withdraw(100);
        System.out.println("Current balance: " + b.balance);
    }
}
