import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("Welcome to Line Comparison Program ");
        // use case :1
           int length1 = (x2-x1)^2+(y2-y1)^2;
           int length2 = (a2-a1)^2+(b2-b1)^2;
        System.out.println(length1);
        System.out.println(length2);
        // use case :2
        if(length1 ==length2)System.out.println(" both lines are Equals");
        //use case :3
        if(length1>length2) System.out.println("line 1 is greater ");
        if(length1<length2) System.out.println("line 2 is greater ");
        if(length1 == length2) System.out.println("both are equals");
        }
    }
