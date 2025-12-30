package methodsandclass;
class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Rohan";
        e.id = 1;
        e.salary = 500000;
        e.display();
    }
}
