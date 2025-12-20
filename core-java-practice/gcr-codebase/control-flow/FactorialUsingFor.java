import java.util.Scanner;
public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            int fact = 1;

            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }

            System.out.println(fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
