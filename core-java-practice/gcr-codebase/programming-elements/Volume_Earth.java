public class Volume_Earth {

        public static void main(String[] args) {

            double radius = 6378;
            double pi = 3.14159;
            double volume = (4.0 / 3) * pi * radius* radius * radius;
            double volumeMiles = volume * 0.239913;

            System.out.println(
                    "The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + volumeMiles);
        }
    }


