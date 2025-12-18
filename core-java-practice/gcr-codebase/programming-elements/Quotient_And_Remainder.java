import java.util.Scanner;
public class Quotient_And_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        double division = (double) n1/n2;
        double remainder = n1 % n2;
        System.out.println("The Quotient is "+ division +" and Reminder is "+ remainder +" of two number " + n1 + "and " + n2);
    }
}
