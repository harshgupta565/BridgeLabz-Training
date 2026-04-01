package string;
import java.util.Scanner;

public class UniqueCharacters {

    static int textLength(String text) {
        int count = 0;
        for (char c : text.toCharArray()) count++;
        return count;
    }

    static char[] uniqueCharacters(String text) {
        int len = textLength(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) temp[index++] = current;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);
        for (char c : unique) System.out.print(c + " ");
    }
}
