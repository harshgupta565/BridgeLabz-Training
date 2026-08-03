package Day1;

import java.util.Scanner;

public class Java_Anagram {

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);

        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}