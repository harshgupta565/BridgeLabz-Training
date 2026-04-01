public class TemperatureAnalyzer {
    // Method to analyze temperature
    public static void analyzeTemperature(float[][] temp) {

        float maxAvg = Float.MIN_VALUE;
        float minAvg = Float.MAX_VALUE;

        int hottestDay = 0;
        int coldestDay = 0;

        System.out.println("Average temperature per day:");

        for (int day = 0; day < 7; day++) {

            float sum = 0;

            for (int hour = 0; hour < 24; hour++) {
                sum += temp[day][hour];
            }

            float avg = sum / 24;
            System.out.println("Day " + (day + 1) + ": " + avg);

            if (avg > maxAvg) {
                maxAvg = avg;
                hottestDay = day;
            }

            if (avg < minAvg) {
                minAvg = avg;
                coldestDay = day;
            }
        }

        System.out.println("\nHottest Day: Day " + (hottestDay + 1)
                + " with average temp " + maxAvg);

        System.out.println("Coldest Day: Day " + (coldestDay + 1)
                + " with average temp " + minAvg);
    }

    // Main method for testing
    public static void main(String[] args) {

        float[][] temperatures = new float[7][24];

        // Sample data
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                temperatures[i][j] = 20 + (float) (Math.random() * 15);
            }
        }

        analyzeTemperature(temperatures);
    }
}
