class MathUtility {
    // factorial
    void factorial(int n) {
        int fact = 1;

        if (n < 0) {
            System.out.println("-1");  // invalid
        }

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    // prime check
    void  isPrime(int n) {

        if (n <= 1) {
            System.out.println(false);
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }

    // GCD
    void  gcd(int a, int b) {

        if (a < 0) a = -a;
        if (b < 0) b = -b;

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println(a);
    }

    // Fibonacci
     void fibonacci(int n) {

        if (n < 0) {
            System.out.println(-1);
        }

        if (n == 0) System.out.println(0);;
        if (n == 1) System.out.println(0);;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
         System.out.println(c);
    }
}
class MathOperations{
    public static void main(String[] args) {
        MathUtility m = new MathUtility();
        m.gcd(125,56);
        m.factorial(666);
        m.fibonacci(5);
        m.isPrime(6);
    }
}
