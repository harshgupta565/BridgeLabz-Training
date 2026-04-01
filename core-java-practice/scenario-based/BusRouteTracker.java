import java.util.Scanner;

public class BusRouteTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        String choice = "no";

        while (!choice.equals("yes")) {

            System.out.print("Enter distance to next stop (in km): ");
            int distance = sc.nextInt();

            totalDistance += distance;

            System.out.println("Total distance covered: " + totalDistance + " km");

            System.out.print("Do you want to get off? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("Passenger got off.");
        System.out.println("Final distance travelled: " + totalDistance + " km");
    }
}
