import java.util.Scanner;

public class FriendsDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        int amarHeight = sc.nextInt();
        int akbarHeight = sc.nextInt();
        int anthonyHeight = sc.nextInt();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        if (youngestAge == amarAge) System.out.println("Amar is youngest");
        else if (youngestAge == akbarAge) System.out.println("Akbar is youngest");
        else System.out.println("Anthony is youngest");

        if (tallestHeight == amarHeight) System.out.println("Amar is tallest");
        else if (tallestHeight == akbarHeight) System.out.println("Akbar is tallest");
        else System.out.println("Anthony is tallest");
    }
}
