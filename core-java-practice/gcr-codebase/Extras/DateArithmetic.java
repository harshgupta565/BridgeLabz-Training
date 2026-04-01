package Extras;
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        String inputDate = sc.next();

        LocalDate date = LocalDate.parse(inputDate);

        // add 7 days, 1 month, 2 years
        LocalDate updatedDate = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);

        System.out.println("Final Date after calculations: " + finalDate);
    }
}
