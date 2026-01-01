package oopsfundamental;

class StudentManagement {

    // static variables
    static String universityName = "Global University";
    static int totalStudents = 0;

    // instance variables
    final int rollNumber;     // final variable
    String name;
    String grade;

    // constructor using this keyword
    StudentManagement(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // static method
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // display details using instanceof
    void displayDetails(Object obj) {
        if (obj instanceof StudentManagement) {
            StudentManagement s = (StudentManagement) obj;
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Name: " + s.name);
            System.out.println("Grade: " + s.grade);
        }
    }

    // update grade using instanceof
    void updateGrade(Object obj, String newGrade) {
        if (obj instanceof StudentManagement) {
            StudentManagement s = (StudentManagement) obj;
            s.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        }
    }

    public static void main(String[] args) {

        StudentManagement s1 = new StudentManagement(101, "Hemashree", "A");
        StudentManagement s2 = new StudentManagement(102, "Sharmila", "B");

        displayTotalStudents();

        s1.displayDetails(s1);
        System.out.println();

        s2.displayDetails(s2);
        s2.updateGrade(s2, "A");
        s2.displayDetails(s2);
    }
}
