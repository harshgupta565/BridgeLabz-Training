package oopsfundamental;
class BankAccount {

    // static variables
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // instance variables
    final int accountNumber;     // final variable
    String accountHolderName;

    // constructor using this keyword
    BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // method using instanceof
    void displayAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + acc.accountNumber);
            System.out.println("Account Holder: " + acc.accountHolderName);
        } else {
            System.out.println("Invalid Account Object");
        }
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(1001, "Ramesh");
        BankAccount a2 = new BankAccount(1002, "Suresh");

        getTotalAccounts();
        System.out.println();

        a1.displayAccountDetails(a1);
        System.out.println();

        a2.displayAccountDetails(a2);
    }
}
