class ParagraphAnalyzer {


    public static void analyzeText(String paragraph, String oldWord, String newWord) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }
        String cleanedText = paragraph.trim().replaceAll("\\s+", " ");
        String[] words = cleanedText.split(" ");
        int wordCount = words.length;
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // 3️⃣ Replace word (case-insensitive)
        String replacedText = cleanedText.replaceAll(
                "(?i)\\b" + oldWord + "\\b", newWord
        );

        // Output
        System.out.println("Original Paragraph:");
        System.out.println(cleanedText);

        System.out.println("\nWord Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);

        System.out.println("\nAfter Replacing \"" + oldWord + "\" with \"" + newWord + "\":");
        System.out.println(replacedText);
    }

    public static void main(String[] args) {

        String paragraph = "   Java is great. java helps build strong applications   ";
        String oldWord = "java";
        String newWord = "Java Programming";

        analyzeText(paragraph, oldWord, newWord);
    }
}
