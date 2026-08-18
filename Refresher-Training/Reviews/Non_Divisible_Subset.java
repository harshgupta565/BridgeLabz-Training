package Reviews;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] freq = new int[k];

        // Count remainders
        for (int num : s) {
            freq[num % k]++;
        }

        int ans = 0;

        // Remainder 0: only one element can be selected
        if (freq[0] > 0) {
            ans++;
        }

        // Check remainder pairs
        for (int r = 1; r <= k / 2; r++) {

            // When k is even, k/2 is its own pair
            if (r == k - r) {
                if (freq[r] > 0) {
                    ans++;
                }
            } else {
                ans += Math.max(freq[r], freq[k - r]);
            }
        }

        return ans;
    }

}

public class Non_Divisible_Subset {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
