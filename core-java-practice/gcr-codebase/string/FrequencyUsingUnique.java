package string;
import java.util.Scanner;

public class FrequencyUsingUnique {

    static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++)
                if (text.charAt(i) == text.charAt(j)) unique = false;

            if (unique) temp[k++] = text.charAt(i);
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueChars(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = frequency(text);
        for (String[] row : data)
            System.out.println(row[0] + " : " + row[1]);
    }
}
