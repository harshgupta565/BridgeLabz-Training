import java.util.Scanner;

public class BMIWith2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask how many persons are there
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: 2D array to store weight, height and BMI
        // index 0 -> weight, index 1 -> height, index 2 -> BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Step 3: Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Weight input (only positive allowed)
            while (true) {
                System.out.print("Enter weight in kg: ");
                double weight = sc.nextDouble();

                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("Weight cannot be negative. Enter again.");
                }
            }

            // Height input (only positive allowed)
            while (true) {
                System.out.print("Enter height in meters: ");
                double height = sc.nextDouble();

                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Height cannot be negative. Enter again.");
                }
            }
        }

        // Step 4: Calculate BMI and decide weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 5: Display all details
        System.out.println("\n------ BMI DETAILS ------");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " m");
            System.out.println("BMI    : " + personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
            System.out.println();
        }
    }
}
