package Day9.Weekly_Challenge;
import java.io.*;
import java.util.*;
import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resulte {



    public static int activityNotifications(List<Integer> expenditure, int d) {

        int notifications = 0;

        // Expenditure values 0 to 200
        int[] count = new int[201];

        // First d days ka frequency count
        for (int i = 0; i < d; i++) {
            count[expenditure.get(i)]++;
        }

        // d-th day se notification check karna start
        for (int i = d; i < expenditure.size(); i++) {

            // 2 * median
            int twiceMedian = getTwiceMedian(count, d);

            int current = expenditure.get(i);

            // current >= 2 * median
            if (current >= twiceMedian) {
                notifications++;
            }

            // Oldest value remove karo
            count[expenditure.get(i - d)]--;

            // Current value window me add karo
            count[current]++;
        }

        return notifications;
    }


    // 2 * median return karega
    private static int getTwiceMedian(int[] count, int d) {

        int cumulative = 0;

        // Odd d
        if (d % 2 == 1) {

            int middle = d / 2 + 1;

            for (int value = 0; value < count.length; value++) {

                cumulative += count[value];

                if (cumulative >= middle) {
                    return 2 * value;
                }
            }

        }

        // Even d
        else {

            int firstMiddle = d / 2;
            int secondMiddle = firstMiddle + 1;

            int first = -1;
            int second = -1;

            for (int value = 0; value < count.length; value++) {

                cumulative += count[value];

                if (first == -1 && cumulative >= firstMiddle) {
                    first = value;
                }

                if (cumulative >= secondMiddle) {
                    second = value;
                    break;
                }
            }

            return first + second;
        }

        return 0;
    }
}


public class Fraudulent_Activity_Notifications {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Resulte.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
