package Day4;

import java.util.Scanner;

public class Loop_Invariant {

    public static void insertionSort(int[] A) {

        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;

            // Shift elements greater than value
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j--;
            }

            // Insert value at correct position
            A[j + 1] = value;
        }

        printArray(A);
    }

    public static void printArray(int[] A) {
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        insertionSort(A);

        sc.close();
    }
}