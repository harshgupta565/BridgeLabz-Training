package oopspillars;
// Interface
interface Department {
    void assignDepartment(String dept);
}

// Abstract class
abstract class Employee implements Department {

    private int id;
    private String name;
    protected double salary;
    private String department;

    // constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // abstract method
    abstract double calculateSalary();

    // common method
    void showDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }

    // interface method
    public void assignDepartment(String dept) {
        department = dept;
    }
}

// Full time employee
class FullTimeEmployee extends Employee {

    FullTimeEmployee(int id, String name, double fixedSalary) {
        super(id, name);
        salary = fixedSalary;
    }

    double calculateSalary() {
        return salary;
    }
}

// Part time employee
class PartTimeEmployee extends Employee {

    int hours;
    double rate;

    PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1, "Rahul", 40000);
        Employee e2 = new PartTimeEmployee(2, "Aman", 100, 200);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        e1.showDetails();
        e2.showDetails();
    }
}
