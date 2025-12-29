package Extras;
import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        System.out.println("C to F: " + celsiusToFahrenheit(temp));
        System.out.println("F to C: " + fahrenheitToCelsius(temp));
    }
}
