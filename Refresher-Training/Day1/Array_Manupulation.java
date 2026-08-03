package Day1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Results {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] diff = new long[n + 2];

        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            diff[a] += k;
            diff[b + 1] -= k;
        }

        long max = 0;
        long current = 0;

        for (int i = 1; i <= n; i++) {
            current += diff[i];
            if (current > max) {
                max = current;
            }
        }

        return max;
    }
}

public class Array_Manupulation {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // Changed for IntelliJ
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput =
                bufferedReader.readLine().trim().split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().trim().split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Results.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}