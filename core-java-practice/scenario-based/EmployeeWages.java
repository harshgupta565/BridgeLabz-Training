public class EmployeeWages {

    // constants
    static int WAGE_PER_HOUR = 20;
    static int IS_FULL_TIME = 1;
    static int IS_PART_TIME = 2;

    public static void main(String[] args) {

        int empStatus = getEmployeeStatus();
        int empHours = getEmployeeHours(empStatus);
        int dailyWage = calculateDailyWage(empHours);

        printResult(empHours, dailyWage);
    }

    // method 1: check employee status
    static int getEmployeeStatus() {
        return (int) (Math.random() * 3);
    }

    // method 2: get working hours
    static int getEmployeeHours(int status) {
        if (status == IS_FULL_TIME) {
            return 8;
        } else if (status == IS_PART_TIME) {
            return 4;
        } else {
            return 0;
        }
    }

    // method 3: calculate daily wage
    static int calculateDailyWage(int hours) {
        return hours * WAGE_PER_HOUR;
    }

    // method 4: print output
    static void printResult(int hours, int wage) {
        System.out.println("Employee Working Hours : " + hours);
        System.out.println("Employee Daily Wage   : ₹" + wage);
    }
}
