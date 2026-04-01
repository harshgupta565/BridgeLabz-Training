class SentenceFormatter {

    public static String formatSentence(String paragraph) {
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);

            // Capitalize first letter of sentence
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            // If punctuation found, next letter should be capital
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;

                // Ensure only one space after punctuation
                if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
                    result.append(' ');
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String input = "hello   world.!how are you?i am fine.";

        String output = formatSentence(input);

        System.out.println(output);
    }
}
