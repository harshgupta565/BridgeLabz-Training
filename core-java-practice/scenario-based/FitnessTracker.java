public class FitnessTracker {

    public static void main(String[] args) {

        int[] pushUps = {30, 0, 25, 40, 0, 35, 20}; // 0 = rest day
        int total = 0;
        int activeDays = 0;

        for (int count : pushUps) {

            if (count == 0) {
                continue;   // skip rest day
            }

            total += count;
            activeDays++;
        }

        double average = total / (double) activeDays;

        System.out.println("Total Push-ups: " + total);
        System.out.println("Average Push-ups: " + average);
    }
}
