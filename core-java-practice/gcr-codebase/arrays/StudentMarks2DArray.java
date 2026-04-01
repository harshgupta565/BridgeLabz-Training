import java.util.Scanner;

public class StudentMarks2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // Step 2: 2D array -> [Physics, Chemistry, Maths]
        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Step 3: Take marks input
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0)
                        System.out.print("Enter Physics marks: ");
                    else if (j == 1)
                        System.out.print("Enter Chemistry marks: ");
                    else
                        System.out.print("Enter Maths marks: ");

                    double m = sc.nextDouble();

                    if (m >= 0 && m <= 100) {
                        marks[i][j] = m;
                        break;
                    } else {
                        System.out.println("Marks must be between 0 and 100. Enter again.");
                    }
                }
            }
        }

        // Step 4: Calculate percentage and grade
        for (int i = 0; i < number; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 75)
                grade[i] = 'A';
            else if (percentage[i] >= 60)
                grade[i] = 'B';
            else if (percentage[i] >= 40)
                grade[i] = 'C';
            else
                grade[i] = 'F';
        }

        // Step 5: Display result
        System.out.println("\n------ STUDENT RESULT ------");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade     : " + grade[i]);
            System.out.println();
        }
    }
}
