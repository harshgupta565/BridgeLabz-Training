package staffshiftscheduler;

public class Main  {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul",1);
        Employee e2 = new Employee("Rahul",2);
       try{
           e1.assignShift("A");
           e1.assignShift("B");


       }catch(ShiftAlreadyAssignedException e){
           System.out.println(e.getMessage());
       }
    }
}
