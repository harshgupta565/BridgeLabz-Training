package methods;
public class CollinearPoints {

    // Method using slope formula
    static boolean isCollinearBySlope(int x1, int y1,
                                      int x2, int y2,
                                      int x3, int y3) {
        int slopeAB = (y2 - y1) * (x3 - x2);
        int slopeBC = (y3 - y2) * (x2 - x1);

        return slopeAB == slopeBC;
    }

    static boolean isCollinearByArea(int x1, int y1,
                                     int x2, int y2,
                                     int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));

        return area == 0;
    }
    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;
        System.out.println("Using Slope Formula:");
        if (isCollinearBySlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are Collinear");
        else
            System.out.println("Points are NOT Collinear");
        System.out.println("\nUsing Area of Triangle Formula:");
        if (isCollinearByArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Points are Collinear");
        else
            System.out.println("Points are NOT Collinear");
    }
}
