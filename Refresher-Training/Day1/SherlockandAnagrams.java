package Day1;

import java.io.*;
import java.util.stream.IntStream;

class Anagram {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     */
    public static int sherlockAndAnagrams(String s) {

        // Write your code here
        return 0;
    }
}

public class SherlockandAnagrams {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // Changed for IntelliJ
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Anagram.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}