package string;

import java.util.Scanner;

public class StringIndexDemo {

    static void generate(String text) {
        System.out.println(text.charAt(text.length()));
    }

    static void handle(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
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
