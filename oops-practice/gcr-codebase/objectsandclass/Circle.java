package objectsandclass;
class Circle {
    double radius = 2.5;

    void calculate() {
        double area = 3.141 * radius * radius;
        double circumference = 2 * 3.141 * radius;

        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
    }

    public static void main(String[] args) {
        new Circle().calculate();
    }
}
