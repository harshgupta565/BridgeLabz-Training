package oopsfundamental;
class Vehicle {

    // static variable
    static double registrationFee = 0.0;

    // instance variables
    final String registrationNumber;   // final variable
    String ownerName;
    String vehicleType;

    // constructor using this keyword
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // static method to update registration fee
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    // method using instanceof
    void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {

        Vehicle.updateRegistrationFee(150.0);

        Vehicle v1 = new Vehicle("ABC123", "Honest raj", "Sedan");
        Vehicle v2 = new Vehicle("XYZ789", "Price danish", "SUV");

        v1.displayDetails(v1);
        v2.displayDetails(v2);
    }
}
