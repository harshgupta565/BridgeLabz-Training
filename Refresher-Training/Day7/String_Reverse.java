package Day7;
import java.io.*;
        import java.util.*;

public class String_Reverse  {

    public static boolean isPalindrome(String A, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (A.charAt(left) != A.charAt(right)) {
            return false;
        }

        return isPalindrome(A, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        if (isPalindrome(A, 0, A.length() - 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}