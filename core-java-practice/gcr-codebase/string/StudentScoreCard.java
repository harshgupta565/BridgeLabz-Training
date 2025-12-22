package string;
import java.util.Scanner;

public class StudentScoreCard {

    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }
        return scores;
    }

    static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][4];

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return result;
    }

    static String[][] calculateGrade(double[][] result) {
        int n = result.length;
        String[][] grades = new String[n][1];

        for (int i = 0; i < n; i++) {
            double p = result[i][2];

            if (p >= 80) grades[i][0] = "A";
            else if (p >= 70) grades[i][0] = "B";
            else if (p >= 60) grades[i][0] = "C";
            else if (p >= 50) grades[i][0] = "D";
            else if (p >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    static void display(int[][] scores, double[][] result, String[][] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            (int)result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grades[i][0]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResults(scores);
        String[][] grades = calculateGrade(result);

        display(scores, result, grades);
    }
}
