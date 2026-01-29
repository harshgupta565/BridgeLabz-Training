package RestaurantTableReservation;

public class Run {
    public static void main(String[] args) {

        RestaurantReservationSystem system = new RestaurantReservationSystem();

        system.addTable(new Table(1, 4));
        system.addTable(new Table(2, 2));
        system.addTable(new Table(3, 6));

        try {
            system.reserveTable(1, "Harsh", "7-8 PM");
            system.reserveTable(2, "Amit", "7-8 PM");
            system.reserveTable(1, "Rohit", "7-8 PM"); // Exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        system.showAvailableTables("7-8 PM");

        system.cancelReservation(1, "7-8 PM");

        system.showAvailableTables("7-8 PM");
    }
}

