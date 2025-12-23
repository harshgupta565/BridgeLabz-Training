package Review;
import java.util.Scanner;
public class Review1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int a = n;
        int count = 0;
        while ( n > 0) {
           // int  digit  = a% 10;
            n = n / 10;
            count++;}
            System.out.println(count);
        }
    }
