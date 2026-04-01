package inheritance;

// Interface
interface Refuelable {
    void refuel();
}

// Parent class
class VehicleNew {
    String model;
    int maxSpeed;

    VehicleNew(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

// Electric vehicle class
class ElectricVehicle extends VehicleNew {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging the battery.");
    }
}

// Petrol vehicle class
class PetrolVehicle extends VehicleNew implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        ev.charge();
        pv.refuel();
    }
}

