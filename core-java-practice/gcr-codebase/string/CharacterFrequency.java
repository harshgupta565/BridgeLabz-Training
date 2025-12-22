package string;
import java.util.Scanner;

public class CharacterFrequency {

    static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] data = frequency(text);
        for (String[] row : data)
            if (row[0] != null)
                System.out.println(row[0] + " : " + row[1]);
    }
}
