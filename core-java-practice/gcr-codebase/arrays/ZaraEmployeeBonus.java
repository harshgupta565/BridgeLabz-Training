import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double yrs = sc.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input, please enter again");
                i--; // same employee ka input dobara
                continue;
            }

            salary[i] = sal;
            service[i] = yrs;
        }

        // Calculating bonus
        for (int i = 0; i < 10; i++) {
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Paid = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
