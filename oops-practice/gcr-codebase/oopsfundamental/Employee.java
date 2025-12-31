package oopsfundamental;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    void showDetails() {
        System.out.println(employeeID + " - " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 501;
        m.department = "IT";
        m.setSalary(60000);

        m.showDetails();
        System.out.println("Salary: ₹" + m.getSalary());
    }
}
