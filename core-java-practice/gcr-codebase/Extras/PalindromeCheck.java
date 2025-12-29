package Extras;
import java.util.Scanner;

public class PalindromeCheck {

    static boolean isPalindrome(String text) {
        String reverse = new StringBuilder(text).reverse().toString();
        return text.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
