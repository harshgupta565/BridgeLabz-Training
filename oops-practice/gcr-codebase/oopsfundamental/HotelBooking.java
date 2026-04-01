package oopsfundamental;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }
    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }
    void showBooking() {
        System.out.println(guestName + " | " + roomType + " | " + nights + " nights");
    }
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.showBooking();
        b2.showBooking();
        b3.showBooking();
    }
}
