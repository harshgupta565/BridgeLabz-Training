
import java.util.Scanner;
public class SumUntil0
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double value = sc.nextDouble();

        while (value != 0) {
            total = total + value;
            value = sc.nextDouble();
        }

        System.out.println(total);
    }
}
