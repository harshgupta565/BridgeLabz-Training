import java.util.Scanner;
public class ArrayTableSixToNine {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int[] result = new int[4];

            int index = 0;
            for (int i = 6; i <= 9; i++) {
                result[index++] = number * i;
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }


