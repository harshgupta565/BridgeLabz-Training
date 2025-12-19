import java.util.*;



class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int radius = n ;          // radius of circle
        double pi = 3.14;           // value of pi

        double area = pi * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}
