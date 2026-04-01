package inheritance;

// Parent class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Child class 1
class Teacher extends PersonNew {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher");
        System.out.println("Teaches: " + subject);
    }
}

// Child class 2
class Student extends PersonNew {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student");
        System.out.println("Grade: " + grade);
    }
}

// Child class 3
class Staff extends PersonNew {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff Member");
        System.out.println("Department: " + department);
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Harsh", 30, "Java");
        Student student = new Student("Amit", 18, "12th");
        Staff staff = new Staff("Ramesh", 45, "Office");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}

