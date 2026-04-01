import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int customer = 1; customer <= 3; customer++) {

            System.out.println("\nCustomer " + customer);

            System.out.print("Movie Type (action/comedy/drama): ");
            String movieType = sc.next();

            System.out.print("Seat Type (gold/silver): ");
            String seatType = sc.next();

            System.out.print("Snacks (yes/no): ");
            String snacks = sc.next();

            int price = 0;

            switch (movieType) {
                case "action":
                    price = 200;
                    break;
                case "comedy":
                    price = 150;
                    break;
                case "drama":
                    price = 180;
                    break;
            }

            if (seatType.equals("gold")) {
                price += 100;
            } else {
                price += 50;
            }

            if (snacks.equals("yes")) {
                price += 80;
            }

            System.out.println("Total Ticket Price: ₹" + price);
        }
    }
}
