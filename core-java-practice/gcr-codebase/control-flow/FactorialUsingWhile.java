import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            int fact = 1;
            int i = 1;

            while (i <= number) {
                fact = fact * i;
                i++;
            }

            System.out.println(fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}

