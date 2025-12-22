package string;
import java.util.Scanner;

public class VowelConsonantCount {

    static String check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c < 'a' || c > 'z') return "Other";
        if ("aeiou".indexOf(c) != -1) return "Vowel";
        return "Consonant";
    }

    static int[] count(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            String r = check(text.charAt(i));
            if (r.equals("Vowel")) v++;
            if (r.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] r = count(text);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
