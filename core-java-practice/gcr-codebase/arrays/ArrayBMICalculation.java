import java.util.Scanner;

public class ArrayBMICalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Arrays to store data
        double[] weight = new double[n];   // weight in kg
        double[] height = new double[n];   // height in meters
        double[] bmi = new double[n];      // BMI value
        String[] status = new String[n];   // weight status

        // Taking input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (meters): ");
            height[i] = sc.nextDouble();
        }

        // Calculating BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying result
        System.out.println("\n----- BMI Report -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + height[i] + " m");
            System.out.println("Weight : " + weight[i] + " kg");
            System.out.println("BMI    : " + bmi[i]);
            System.out.println("Status : " + status[i]);
            System.out.println();
        }
    }
}
