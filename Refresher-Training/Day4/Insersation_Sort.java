package Day4;

import java.util.*;

public class Insersation_Sort {

    public static void insertionSort1(int n, List<Integer> arr) {

        int value = arr.get(n - 1);
        int i = n - 2;

        while (i >= 0 && arr.get(i) > value) {
            arr.set(i + 1, arr.get(i));

            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            i--;
        }

        arr.set(i + 1, value);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        insertionSort1(n, arr);

        sc.close();
    }
}