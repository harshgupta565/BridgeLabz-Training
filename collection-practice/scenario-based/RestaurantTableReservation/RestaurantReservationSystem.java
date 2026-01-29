package RestaurantTableReservation;

import java.util.*;

public class RestaurantReservationSystem {

    private Map<Integer, Table> tables = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();

    // Add tables
    public void addTable(Table table) {
        tables.put(table.getTableNumber(), table);
    }

    public void reserveTable(int tableNumber, String customerName, String timeSlot)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNumber &&
                    r.getTimeSlot().equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " is already reserved for " + timeSlot);
            }
        }

        reservations.add(new Reservation(tableNumber, customerName, timeSlot));
        System.out.println("Reservation successful!");
    }

    // Cancel reservation
    public void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> iterator = reservations.iterator();

        while (iterator.hasNext()) {
            Reservation r = iterator.next();
            if (r.getTableNumber() == tableNumber &&
                    r.getTimeSlot().equals(timeSlot)) {
                iterator.remove();
                System.out.println("Reservation cancelled!");
                return;
            }
        }

        System.out.println("No reservation found.");
    }

    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");

        for (Table table : tables.values()) {
            boolean reserved = false;

            for (Reservation r : reservations) {
                if (r.getTableNumber() == table.getTableNumber() &&
                        r.getTimeSlot().equals(timeSlot)) {
                    reserved = true;
                    break;
                }
            }

            if (!reserved) {
                System.out.println("Table " + table.getTableNumber() +
                        " (Capacity: " + table.getCapacity() + ")");
            }
        }
    }
}

