package string;

import java.util.Scanner;

public class WordLengthTable {

    static int findLength(String text) {
        int c = 0;
        while (true) {
            try {
                text.charAt(c++);
            } catch (Exception e) {
                return c - 1;
            }
        }
    }

    static String[] splitText(String text) {
        int len = findLength(text);
        int words = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') words++;

        String[] arr = new String[words];
        int idx = 0, start = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++)
                    w += text.charAt(j);
                arr[idx++] = w;
                start = i + 1;
            }
        }
        return arr;
    }

    static String[][] makeTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = makeTable(words);

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
