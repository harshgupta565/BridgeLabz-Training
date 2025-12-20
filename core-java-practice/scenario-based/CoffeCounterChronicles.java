
import java.util.Scanner;

public class CoffeCounterChronicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("☕ --- Welcome to Ravi's Coffee Counter --- ☕");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("Espresso   : 100 INR");
            System.out.println("Latte      : 150 INR");
            System.out.println("Cappuccino : 200 INR");
            System.out.println("Type 'exit' to close the counter.");

            System.out.print("\nWhich coffee would you like? ");
            String coffeeType = scanner.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Closing the counter. Have a great day! 👋");
                break;
            }

            double pricePerCup = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 100;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 200;
                    break;
                default:
                    System.out.println("⚠️ Sorry, we don't serve that. Please pick from the menu.");
                    continue;
            }

            System.out.print("How many cups? ");
            int quantity = scanner.nextInt();

            double baseAmount = pricePerCup * quantity;
            double gstAmount = baseAmount * 0.18;
            double totalBill = baseAmount + gstAmount;

            System.out.println("\n🧾 --- BILL RECEIPT --- 🧾");
            System.out.println("Order: " + quantity + " x " + coffeeType);
            System.out.println("Base Price: " + baseAmount);
            System.out.println("GST (18%):  " + gstAmount);
            System.out.println("-------------------------");
            System.out.println("TOTAL TO PAY: " + totalBill + " INR");
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}