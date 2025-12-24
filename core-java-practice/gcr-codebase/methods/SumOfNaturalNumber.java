package methods;
import java.util.Scanner;

public class SumOfNaturalNumber {

    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = recursiveSum(n);
        int f = formulaSum(n);

        System.out.println(r);
        System.out.println(f);
        System.out.println(r == f);


    }
}
