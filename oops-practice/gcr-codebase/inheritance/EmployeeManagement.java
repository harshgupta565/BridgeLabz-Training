package inheritance;
// Parent Class
class Employee {
    String name;
    int id;
    int salary;
    Employee(String name,int  id, int  salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("give the Deatils of Employeee");
    }
}
// Sub  or child class
class Manager extends Employee{
    Manager(String name , int id , int salary){
        super(name,id,salary);
    }
    @Override
    void displayDetails() {
        System.out.println(" name " + name +" id "+ id +" salary " + salary);
    }
}
// child Developer class
class Developer extends Employee{
    Developer(String name , int id,int salary){
        super (name , id , salary);
    }

    @Override
    void displayDetails() {
        System.out.println(" name " + name +" id "+ id +" salary " + salary);
    }
}
class intern  extends Employee{
    intern (String name , int id , int salary){
        super(name , id , salary);
    }
    void displayDetails(){
        System.out.println(" name " + name +" id "+ id +" salary " + salary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager = new Manager("Harsh", 101, 80000);
        Developer developer = new Developer("Aniket", 102, 60000);
        intern internEmployee = new intern("Amit", 103, 20000);

        // Calling displayDetails for each
        manager.displayDetails();
        developer.displayDetails();
        internEmployee.displayDetails();

    }
}