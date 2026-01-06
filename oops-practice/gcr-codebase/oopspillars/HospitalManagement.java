package oopspillars;
abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;   // encapsulated

    Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println(patientId + " " + name + " " + age);
    }

    protected void setDiagnosis(String d) {
        diagnosis = d;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int days;

    InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.days = days;
    }

    double calculateBill() {
        return days * 2000;   // room charge per day
    }

    public void addRecord(String record) {
        setDiagnosis(record);
    }

    public void viewRecords() {
        System.out.println("InPatient medical record added");
    }
}

class OutPatient extends Patient {

    OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    double calculateBill() {
        return 500;   // consultation fee
    }
}

public class HospitalManagement {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ravi", 35, 3);
        Patient p2 = new OutPatient(102, "Anita", 28);

        Patient[] patients = { p1, p2 };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            System.out.println();
        }
    }
}
