import java.util.Scanner;
public class DivisibilityOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = (n%5 == 0);
        System.out.println( "Is the number "+ n +" divisible by 5? "+ result);
    }
}
