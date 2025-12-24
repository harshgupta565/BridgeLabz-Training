package string;

public class RemoveCharacter {

    static String removeChar(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch)
                result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeChar("Hello World", 'l'));
    }
}
