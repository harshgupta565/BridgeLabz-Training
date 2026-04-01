package string;
import java.util.Scanner;

public class BMICalculatorString {

    static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    static void display(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : data) {
            System.out.println(
                    row[0] + "\t\t" +
                            row[1] + "\t\t" +
                            row[2] + "\t" +
                            row[3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] input = new double[10][2];

        for (int i = 0; i < 10; i++) {
            input[i][0] = sc.nextDouble();
            input[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(input);
        display(result);
    }
}
