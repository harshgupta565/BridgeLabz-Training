package methodsandclass;
class MovieTicket {
    boolean booked = false;

    void book() {
        if (!booked) {
            booked = true;
            System.out.println("Ticket booked for movie: Dragon");
            System.out.println("Seat Number: A10");
            System.out.println("Price: $120.0");
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.book();
        t.book();
    }
}
