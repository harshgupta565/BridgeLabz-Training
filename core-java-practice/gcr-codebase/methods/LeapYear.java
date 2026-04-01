package methods;
import java.util.Scanner;
public class LeapYear {
    public static void checkleap(int year) {
        if (year % 400 == 0)
            System.out.println("it is a leap year");
        else if (year % 4 == 0)
            System.out.println("it is a leap year");
        else if (year >= 1582)
            System.out.println("It is a leap year");
        else {
            System.out.println("It is not a Leap Year");
        }
    }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter Year :");
            int year = sc.nextInt();
            checkleap(year);
        }
    }
