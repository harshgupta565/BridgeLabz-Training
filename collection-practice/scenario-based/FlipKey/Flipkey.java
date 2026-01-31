package FlipKey;
import java.util.Scanner;
class FlipKey {

    public static String CleanseAndInvert(String input) {

        // 1) Null or length < 6 check
        if (input == null || input.length() < 6) {
            return "";
        }

        // 2) Check for space, digit, or special character
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return "";
            }
        }

        // Convert to lowercase
        input = input.toLowerCase();

        // Remove characters with even ASCII values
        StringBuilder filtered = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch % 2 != 0) {   // odd ASCII only
                filtered.append(ch);
            }
        }

        // Reverse the string
        filtered.reverse();

        // Convert even index characters to uppercase
        for (int i = 0; i < filtered.length(); i++) {
            if (i % 2 == 0) {
                filtered.setCharAt(i,
                        Character.toUpperCase(filtered.charAt(i)));
            }
        }

        return filtered.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String input = sc.nextLine();

        String result = CleanseAndInvert(input);

        if (result.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }
    }
}
