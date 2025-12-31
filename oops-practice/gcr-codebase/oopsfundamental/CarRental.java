package oopsfundamental;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int costPerDay = 1000;

    // Constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void calculateCost() {
        int total = rentalDays * costPerDay;
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        CarRental r = new CarRental("Ravi", "Swift", 4);
        r.calculateCost();
    }
}
