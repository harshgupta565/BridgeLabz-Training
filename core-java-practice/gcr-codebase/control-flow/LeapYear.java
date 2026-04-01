
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your year :");
      int year = sc.nextInt();
      if(year>=1582){
          if(year%400 == 0) {System.out.println("It is a Leap year");}
          else if(year%100 ==0 ) {System.out.println("It is not a Leap year");}
         else  if(year%4==0){System.out.println("It is a Leap year");}
         else {
              System.out.println("It is Not a Leap Year");
          }
      }
      else{
          System.out.println("Not a Valid Year");
      }
    }
}
