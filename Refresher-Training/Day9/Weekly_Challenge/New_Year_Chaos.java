package Day9.Weekly_Challenge;
import java.io.*;
import java.util.*;

class Results {
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for (int i = 0; i < q.size(); i++) {
            int person = q.get(i);
            if (person - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }
        // number of bribe counting ke liyee
        for (int i = 0; i < q.size(); i++) {

            int person = q.get(i);

            // Sirf last 2 possible positions se check karna hai
            int start = Math.max(0, person - 2);

            for (int j = start; j < i; j++) {

                if (q.get(j) > person) {
                    bribes++;
                }
            }
        }

        System.out.println(bribes);
    }

}
public class New_Year_Chaos{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qTemp[i]);
                q.add(qItem);
            }

            Results.minimumBribes(q);
        }

        bufferedReader.close();
    }
}
