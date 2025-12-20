import java.util.Scanner;

public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            int sum1 = n * (n + 1) / 2;
            int sum2 = 0;
            int i = 1;

            while (i <= n) {
                sum2 = sum2 + i;
                i++;
            }

            System.out.println(sum1);
            System.out.println(sum2);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
