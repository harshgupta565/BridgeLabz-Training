package Day1;

import java.io.*;

class Outt{

    /*
     * Complete the 'camelcase' function below.
     */
    public static int camelcase(String s) {

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}

public class CamelCase {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // Changed for IntelliJ
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int result = Outt.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}