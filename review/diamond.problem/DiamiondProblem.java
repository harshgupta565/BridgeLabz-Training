package diamond.problem;

interface Vehicle {
    void run();
}

interface Bike {
    void start();
}

// Car implements multiple interfaces
class Car implements Vehicle, Bike {

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void run() {
        System.out.println("Vehicle is running");
    }
}

public class DiamiondProblem {
    public static void main(String[] args) {

        Car car = new Car();

        car.start(); // from Bike interface
        car.run();   // from Vehicle interface
    }
}
