package student;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "employees.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            // Writing header
            writer.write("ID,Name,Department,Salary");
            writer.newLine();

            // Writing employee records
            writer.write("101,Rahul,Engineering,60000");
            writer.newLine();

            writer.write("102,Amit,HR,45000");
            writer.newLine();

            writer.write("103,Neha,Finance,55000");
            writer.newLine();

            writer.write("104,Pooja,Marketing,50000");
            writer.newLine();

            writer.write("105,Karan,Sales,48000");
            writer.newLine();

            System.out.println("CSV file created and data written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
