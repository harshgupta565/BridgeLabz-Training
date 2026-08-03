package Day1;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     */
    public static List<Integer> rotLeft(List<Integer> a, int d) {

        int n = a.size();
        d = d % n;

        List<Integer> result = new ArrayList<>();

        for (int i = d; i < n; i++) {
            result.add(a.get(i));
        }

        for (int i = 0; i < d; i++) {
            result.add(a.get(i));
        }

        return result;
    }
}

public class Left_Rotation {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        // Changed for IntelliJ
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput =
                bufferedReader.readLine().trim().split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.rotLeft(a, d);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
        );
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}