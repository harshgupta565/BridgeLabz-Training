package oopsfundamental;
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // calling parameterized constructor
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    void showRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        c1.showRadius();
        c2.showRadius();
    }
}
