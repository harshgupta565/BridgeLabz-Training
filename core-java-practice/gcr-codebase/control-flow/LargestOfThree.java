import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        boolean isFirstLargest  = n1 > n2 && n1 > n3;
        boolean isSecondLargest = n2 > n1 && n2 > n3;
        boolean isThirdLargest  = n3 > n1 && n3 > n2;
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the Second number the largest? " + isSecondLargest);
        System.out.println("Is the Third number the largest? " + isThirdLargest);
    }
}
