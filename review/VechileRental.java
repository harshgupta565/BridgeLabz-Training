interface Rentable {
    double calculateRent(int numberOfDays);
}

class Vehicle {
    protected double rentPerDay;

    Vehicle(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }
}

class Bike extends Vehicle implements Rentable {
    Bike(double rentPerDay) {
        super(rentPerDay);
    }

    public double calculateRent(int numberOfDays) {
        return rentPerDay * numberOfDays;
    }
}

class Car extends Vehicle implements Rentable {
    Car(double rentPerDay) {
        super(rentPerDay);
    }

    public double calculateRent(int numberOfDays) {
        return rentPerDay * numberOfDays + 500;
    }
}

class Truck extends Vehicle implements Rentable {
    Truck(double rentPerDay) {
        super(rentPerDay);
    }

    public double calculateRent(int numberOfDays) {
        return rentPerDay * numberOfDays + 1000;
    }
}

public class VechileRental {
    public static void main(String[] args) {

        Rentable bike = new Bike(300);
        Rentable car = new Car(1000);
        Rentable truck = new Truck(2000);

        System.out.println("Bike Rent: " + bike.calculateRent(2));
        System.out.println("Car Rent: " + car.calculateRent(2));
        System.out.println("Truck Rent: " + truck.calculateRent(2));
    }
}
