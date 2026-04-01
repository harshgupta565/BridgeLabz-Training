package methods;
import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println(result[1] + " " + result[0]);

        sc.close();
    }
}
