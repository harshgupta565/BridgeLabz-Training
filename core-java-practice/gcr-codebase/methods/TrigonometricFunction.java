package methods;
import java.util.Scanner;

public class TrigonometricFunction {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{
                Math.sin(rad),
                Math.cos(rad),
                Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);


    }
}
