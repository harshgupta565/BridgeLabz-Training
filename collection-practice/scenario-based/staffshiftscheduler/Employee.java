package staffshiftscheduler;

//public class Employee {
//    String EpmloyeeName;
//    int EmployeeID;
//    String shift;
//    public Employee(String EpmloyeeName, int EmployeeID, String shift){
//        this.EpmloyeeName = EpmloyeeName;
//        this.EmployeeID = EmployeeID;
//        this.shift = shift;
//    }
//
//    void shiftassigner(String newshift) throws ShiftAlreadyAssignedException {
//            if  (this.shift != newshift){
//                throw new ShiftAlreadyAssignedException("Shift is already assigned ");
//            }
//
//    }
//}

class Employee {

    private String employeeName;
    private int employeeID;
     String shift; // initially null

    public Employee(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public void assignShift(String newShift) throws ShiftAlreadyAssignedException {

        if (this.shift != null) {
            throw new ShiftAlreadyAssignedException(
                    "Shift already assigned to " + employeeName);
        }

        this.shift = newShift;
        System.out.println("Shift assigned successfully");
    }

    @Override
    public String toString() {
        return employeeID + " - " + employeeName + " (" + shift + ")";
    }
}