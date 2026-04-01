class Bankaccount{
    int blance ;
    int accountnumber;
     Bankaccount(int amount , int accountnumber){
         this.blance=blance;
         this.accountnumber = accountnumber;
     }
    void deposit(double amount ) {
        if (amount > 0) {
            blance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= blance) {
            blance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + blance);
    }
}
class BankManager{
    public static void main(String[] args) {
        Bankaccount acc1 =new Bankaccount(125 ,5556);
        acc1.deposit(125);
        acc1.withdraw(35);
        acc1.checkBalance();
    }
}