package string;
import java.util.Scanner;

public class SplitCompare {

    static int findLength(String text) {
        int c = 0;
        while (true) {
            try {
                text.charAt(c);
                c++;
            } catch (Exception e) {
                return c;
            }
        }
    }

    static String[] splitText(String text) {
        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') words++;
        }

        String[] result = new String[words];
        int index = 0, start = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++) {
                    w += text.charAt(j);
                }
                result[index++] = w;
                start = i + 1;
            }
        }
        return result;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] a = splitText(text);
        String[] b = text.split(" ");

        System.out.println(compare(a, b));
    }
}
