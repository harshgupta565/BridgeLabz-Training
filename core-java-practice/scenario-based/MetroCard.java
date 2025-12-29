 import java.util.Scanner;
      public class MetroCard {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double balance = 200;
            while (balance > 0) {

                System.out.print("Enter distance in km (0 to exit): ");
                int distance = sc.nextInt();

                if (distance == 0) {
                    break;
                }
                double fare = (distance <= 5) ? 20 :
                        (distance <= 15) ? 40 : 60;

                if (balance >= fare) {
                    balance = balance - fare;
                    System.out.println("Fare deducted: ₹" + fare);
                    System.out.println("Remaining balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient balance");
                    break;
                }
                System.out.println();
            }
        }
    }
