package string;
import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generate(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generate(text);
        handle(text);
    }
}
