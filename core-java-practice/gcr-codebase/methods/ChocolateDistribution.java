package methods;
import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int[] result = distributeChocolates(chocolates, children);
        System.out.println(result[1] + " " + result[0]);

    }
}
