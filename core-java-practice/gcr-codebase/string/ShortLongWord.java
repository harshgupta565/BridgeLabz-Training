package string;

import java.util.Scanner;

public class ShortLongWord {

    static int findLength(String s) {
        int i = 0;
        while (true) {
            try { s.charAt(i++); }
            catch (Exception e) { return i - 1; }
        }
    }

    static String[] splitText(String text) {
        return text.split(" ");
    }

    static int[] findShortLong(String[] words) {
        int min = findLength(words[0]);
        int max = min;

        for (String w : words) {
            int l = findLength(w);
            if (l < min) min = l;
            if (l > max) max = l;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitText(text);
        int[] r = findShortLong(words);

        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
