package string;

public class LongestWord {

    static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestWord("Java is very powerful"));
    }
}
