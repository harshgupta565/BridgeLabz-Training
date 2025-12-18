import java.util.Scanner;
public class User_input_fee_calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Fee (INR): ");
        int fee = input.nextInt();

        System.out.print("Enter University Discount Percentage: ");
        int discountPercent = input.nextInt();

        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

