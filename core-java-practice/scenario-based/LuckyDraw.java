import java.util.Scanner;
public class LuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        System.out.println("please Enter Your Lucky Number ");
        if(number % 3 ==0 && number % 5 == 0) System.out.println(" Congratulation You Won the Draw");
        else System.out.println("Better luck next Time");
    }
}

