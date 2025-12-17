package Array_basics_dsa;


import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        int num, original, reverse = 0, digit;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = sc.nextInt();

        original = num;

        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
