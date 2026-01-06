package oopspillars;

import java.util.*;

// 1️⃣ Insurable interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// 2️⃣ Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;  // encapsulated
    private String type;           // Car, Bike, Truck
    protected double rentalRate;   // accessible in child classes
// constructor bna diye hh
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // Abstract method
    abstract double calculateRentalCost(int days);
}

// 3️⃣ Car class
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String policyNumber) {
        super(vehicleNumber, "Car", 1000);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 5000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

// 4️⃣ Bike class
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String policyNumber) {
        super(vehicleNumber, "Bike", 500);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 2000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

// 5️⃣ Truck class
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String policyNumber) {
        super(vehicleNumber, "Truck", 2000);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 8000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

// 6️⃣ Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        // 7️⃣ List of vehicles (polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MH12AB1234", "CAR123456"));
        vehicles.add(new Bike("MH14XY5678", "BIKE987654"));
        vehicles.add(new Truck("MH01TR9999", "TRUCK456789"));

        // 8️⃣ Iterate and calculate rental & insurance
        for (Vehicle v : vehicles) {
            System.out.println("\nVehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));

            Insurable i = (Insurable) v;  // typecast to interface
            System.out.println("Insurance Cost: " + i.calculateInsurance());
            System.out.println(i.getInsuranceDetails());
        }
    }
}
