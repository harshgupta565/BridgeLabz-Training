package oopsfundamental;
class Patient {

    // static variables
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    // instance variables
    final int patientID;     // final variable
    String name;
    int age;
    String ailment;

    // constructor using this keyword
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // static method
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // method using instanceof
    void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Patient p1 = new Patient(201, "Amit", 30, "Fever");
        Patient p2 = new Patient(202, "Sneha", 25, "Cold");

        getTotalPatients();
        System.out.println();

        p1.displayDetails(p1);
        p2.displayDetails(p2);
    }
}
