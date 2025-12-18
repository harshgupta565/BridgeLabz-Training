import java.util.*;
public class Height_Conversion {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter distance in feet: ");
            double distanceInFeet = input.nextDouble();

            double distanceInYards = distanceInFeet / 3;
            double distanceInMiles = distanceInYards / 1760;

            System.out.println(
                    "The distance in feet is " + distanceInFeet + " while in yards is " + distanceInYards + " and miles is " + distanceInMiles);
        }
    }


