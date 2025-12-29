import java.util.Scanner;
public class BmiFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Weight ");
        Double weight = sc.nextDouble();
        System.out.println("Please Enter your Height(Mtrs) ");
        Double Height = sc.nextDouble();
        // calculate Bmi
        Double BMI = weight/(Height*Height);
        if(BMI<18.5) System.out.println("UnderWeight");
        else if (18.5 <BMI &&  BMI<25) System.out.println("Healthy");
        else System.out.println("Obese");


    }
}
