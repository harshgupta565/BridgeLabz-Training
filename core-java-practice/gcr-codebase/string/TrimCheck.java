package string;
import java.util.Scanner;

public class TrimCheck {

    static int[] trimIndex(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    static String substring(String text, int s, int e) {
        String r = "";
        for (int i = s; i < e; i++)
            r += text.charAt(i);
        return r;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndex(text);
        String a = substring(text, idx[0], idx[1]);
        String b = text.trim();

        System.out.println(compare(a, b));
    }
}
