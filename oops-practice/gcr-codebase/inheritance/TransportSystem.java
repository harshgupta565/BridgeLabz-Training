package inheritance;
// parent class
class Vehicle{
    int maxspeed ;
    String fueltype;

    public Vehicle(int maxspeed , String fueltype) {
        this.maxspeed = maxspeed;
        this.fueltype = fueltype;
    }
    void displayInfo(){
        System.out.println("Display details of vehicle ");
    }
}
class Car extends VehicleNew {
    public Car(int maxspeed, String fueltype) {
        super(maxspeed, fueltype);
    }
    void displayInfo(){
        System.out.println(" maxspeed "+maxspeed+ " fuel type "+ fueltype);
    }
}
class Truck extends VehicleNew {
    public Truck (int maxspeed, String fueltype) {
        super(maxspeed, fueltype);
    }
    void displayInfo(){
        System.out.println(" maxspeed "+maxspeed+ " fuel type "+ fueltype);
    }
}
class Motorcycle extends VehicleNew {
    public Motorcycle(int maxspeed, String fueltype) {
        super(maxspeed, fueltype);
    }
    void displayInfo(){
        System.out.println(" maxspeed "+maxspeed+ " fuel type "+ fueltype);
    }
}

public class TransportSystem {
    public static void main(String[]args){
     VehicleNew vehicle = new VehicleNew(120,"petrol");
     Car car = new Car(124,"petrol");
     Truck truck = new Truck(2523,"Petrol");
     Motorcycle motorcycle = new Motorcycle(524,"CNG");
     vehicle.displayInfo();
     truck.displayInfo();
     car.displayInfo();
     motorcycle.displayInfo();
    }
}
