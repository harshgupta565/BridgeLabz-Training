import java.util.Scanner;
public class RocketLaunchUsingFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();   // user se starting number lo

        for (int i = counter; i >= 1; i--) {   // 1 tak count down
            System.out.println(i);
        }

        System.out.println("Launch");
    }
}
