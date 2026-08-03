package Day1;
import java.io.*;
        import java.util.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Out {
    /*
     * Complete the 'reverseArray' function below.
     */
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> result = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            result.add(a.get(i));
        }
        return result;
    }
}
public class Array_Ds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        // Changed for IntelliJ
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> res = Out.reverseArray(arr);
        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
        );
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

