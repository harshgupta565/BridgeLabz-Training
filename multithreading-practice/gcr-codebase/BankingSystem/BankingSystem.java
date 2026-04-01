package BankingSystem;

import java.time.LocalDateTime;

class BankAccount {
    int balance = 10000;

    boolean withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
}

class Transaction implements Runnable {
    BankAccount account;
    int amount;
    String customerName;

    Transaction(BankAccount account, int amount, String customerName) {
        this.account = account;
        this.amount = amount;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        System.out.println("[" + customerName + "] Thread State before processing: "
                + Thread.currentThread().getState());

        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

        boolean success = account.withdraw(amount);

        if (success) {
            System.out.println("Transaction successful: " + customerName +
                    ", Amount: " + amount +
                    ", Balance: " + account.balance +
                    ", Time: " + LocalDateTime.now());
        } else {
            System.out.println("Transaction failed: " + customerName +
                    ", Amount: " + amount +
                    ", Balance: " + account.balance +
                    ", Time: " + LocalDateTime.now());
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, 3000, "Customer-1"), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, 4000, "Customer-2"), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, 2000, "Customer-3"), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, 5000, "Customer-4"), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, 1500, "Customer-5"), "Customer-5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

