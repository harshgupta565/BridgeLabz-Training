package string;
public class ReplaceWord {

    static String replace(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        System.out.println(replace("Java is easy", "easy", "powerful"));
    }
}
