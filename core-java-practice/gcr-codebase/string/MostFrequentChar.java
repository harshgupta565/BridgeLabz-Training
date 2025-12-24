package string;
public class MostFrequentChar {

    static char mostFrequent(String str) {
        int[] freq = new int[256];
        char maxChar = str.charAt(0);
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequent("success"));
    }
}
