import java.util.Scanner;
public class MaximumNumberHandShakes {
    public static void main(String[] args) {
        System.out.println("Enter number of student :");
        Scanner sc = new Scanner(System.in);
        Double n = sc.nextDouble();
        Double number_hanshake=(n*(n-1))/2;
        System.out.println("Possible number of Feedback "+number_hanshake );
    }
}
