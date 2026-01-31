import java.util.*;

public class LexicalTwist {

    public static boolean isValidWord(String s) {
        return !s.trim().contains(" ");
    }

    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        if (!isValidWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (!isValidWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // Check reverse (case-insensitive)
        String reversedFirst = new StringBuilder(first).reverse().toString();

        if (reversedFirst.equalsIgnoreCase(second)) {

            // Reverse → lowercase → replace vowels with '@'
            StringBuilder result = new StringBuilder();
            for (char ch : reversedFirst.toLowerCase().toCharArray()) {
                if (isVowel(ch)) {
                    result.append('@');
                } else {
                    result.append(ch);
                }
            }
            System.out.println(result.toString());

        } else {

            // Combine and uppercase
            String combined = (first + second).toUpperCase();

            int vowels = 0, consonants = 0;
            for (char ch : combined.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if (isVowel(ch)) vowels++;
                    else consonants++;
                }
            }

            if (vowels == consonants) {
                System.out.println("Vowels and consonants are equal");
                return;
            }

            LinkedHashSet<Character> set = new LinkedHashSet<>();

            if (vowels > consonants) {
                for (char ch : combined.toCharArray()) {
                    if (isVowel(ch)) {
                        set.add(ch);
                        if (set.size() == 2) break;
                    }
                }
            } else {
                for (char ch : combined.toCharArray()) {
                    if (!isVowel(ch)) {
                        set.add(ch);
                        if (set.size() == 2) break;
                    }
                }
            }

            for (char ch : set) {
                System.out.print(ch);
            }
        }
    }
}

