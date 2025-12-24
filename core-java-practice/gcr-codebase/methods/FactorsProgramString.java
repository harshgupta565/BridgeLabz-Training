package methods;
public class FactorsProgramString {

    static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                factors[index++] = i;

        return factors;
    }

    static int sumFactors(int[] f) {
        int sum = 0;
        for (int x : f) sum += x;
        return sum;
    }

    static long productFactors(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double productCubeFactors(int[] f) {
        double p = 1;
        for (int x : f)
            p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        int[] f = findFactors(6);
        System.out.println(sumFactors(f));
        System.out.println(productFactors(f));
        System.out.println(productCubeFactors(f));
    }
}
