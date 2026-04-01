package searching;
public class SearchWord {

    static String findSentence(String[] sentences, String word) {
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                return sentences[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is easy to learn",
                "Linear search is simple",
                "Binary search is fast"
        };

        String word = "search";

        String result = findSentence(sentences, word);
        System.out.println(result);
    }
}
