import java.util.*;


class NoDriverAvailableException extends Exception{
   public NoDriverAvailableException(String msg){
       super(msg);
   }
}
// Interface
interface FareCalculator {
    double calculateFare(double distance);
}

// Normal Pricing
class NormalFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10; // ₹10 per km
    }
}

// Peak Pricing (Polymorphism)
class PeakFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15; // ₹15 per km
    }
}

// User Class
class User {
    int userId;
    String name;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}

// Driver Class
class Driver {
    int driverId;
    String name;
    boolean available = true;

    Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }
}

// Ride Class
class Ride {
    User user;
    Driver driver;
    double distance;
    double fare;

    Ride(User user, Driver driver, double distance, FareCalculator calculator) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = calculator.calculateFare(distance);
    }
    void showRideDetails() {
        System.out.println("User: " + user.name);
        System.out.println("Driver: " + driver.name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }
}

public class RideBooking {
    public static void main(String[] args) {

        User user = new User(1, "Harsh");
        Driver d1 = new Driver(101, "Ramesh");

        try {
            if (!d1.available)
                throw new NoDriverAvailableException("No driver available!");

            FareCalculator fare;
            boolean isPeakTime = true;

            if (isPeakTime)
                fare = new PeakFare();
            else
                fare = new NormalFare();

            Ride ride = new Ride(user, d1, 8, fare);
            d1.available = false;
            ride.showRideDetails();

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

