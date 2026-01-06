import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InvalidMarkException extends Exception {
    InvalidMarkException(String msg) {
        super(msg);
    }
}

// Student class
class Student {
    String name;
    String[] subjects;
    int[] marks;

    Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;

        // validate marks
        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100");
            }
        }
    }

    // calculate average
    double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    // assign grade
    char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    // display report card
    void displayReport() {
        System.out.println("\n----- REPORT CARD -----");
        System.out.println("Student Name: " + name);
        System.out.println("Subjects & Marks:");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-----------------------");
    }
}

// MAIN CLASS
public class StudentReportApp {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try {
            String[] subjects = {"Math", "Science", "English"};

            int[] marks1 = {85, 90, 88};
            int[] marks2 = {70, 65, 72};

            students.add(new Student("Rahul", subjects, marks1));
            students.add(new Student("Amit", subjects, marks2));

            // invalid marks example
            int[] marks3 = {95, 110, 80};
            students.add(new Student("Neha", subjects, marks3));

        } catch (InvalidMarkException e) {
            System.out.println(e.getMessage());
        }

        // display all reports
        for (Student s : students) {
            s.displayReport();
        }
    }
}
