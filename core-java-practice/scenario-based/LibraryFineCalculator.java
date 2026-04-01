import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int book = 1; book <= 5; book++) {

            System.out.println("\nBook " + book);

            System.out.print("Enter Due Day: ");
            int dueDay = sc.nextInt();

            System.out.print("Enter Return Day: ");
            int returnDay = sc.nextInt();

            if (returnDay > dueDay) {
                int lateDays = returnDay - dueDay;
                int fine = lateDays * 5;
                System.out.println("Late by " + lateDays + " days. Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }
    }
}
