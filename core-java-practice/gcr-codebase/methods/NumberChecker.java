package methods;
public class NumberChecker {

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits)
            sum += Math.pow(d, power);

        return sum == num;
    }

    static void largestSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + second);
    }

    static void smallestSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Second Smallest: " + second);
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);

        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(num, digits));
        largestSecondLargest(digits);
        smallestSecondSmallest(digits);
    }
}
