package methods;

public class NumberTypes {

    static int sumProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum;
    }

    static boolean isPerfect(int num) {
        return sumProperDivisors(num) == num;
    }

    static boolean isAbundant(int num) {
        return sumProperDivisors(num) > num;
    }

    static boolean isDeficient(int num) {
        return sumProperDivisors(num) < num;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 145;
        System.out.println(isPerfect(num));
        System.out.println(isAbundant(num));
        System.out.println(isDeficient(num));
        System.out.println(isStrong(num));
    }
}
