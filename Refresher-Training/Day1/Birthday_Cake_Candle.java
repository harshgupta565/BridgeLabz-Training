package Day1;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class  Cake{

    /*
     * Complete the 'birthdayCakeCandles' function below.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {

        int max = candles.get(0);
        int count = 1;

        for (int i = 1; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            } else if (candles.get(i) == max) {
                count++;
            }
        }

        return count;
    }
}

public class Birthday_Cake_Candle {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // Changed for IntelliJ
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Cake.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}