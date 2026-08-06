package Day5;

import java.util.Arrays;

public class Merge_Sort_Counting_Inversions {

    public static long countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static long mergeSort(int[] arr, int left, int right) {
        long inversions = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;

            inversions += mergeSort(arr, left, mid);
            inversions += mergeSort(arr, mid + 1, right);
            inversions += merge(arr, left, mid, right);
        }

        return inversions;
    }

    private static long merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        long inversions = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversions += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return inversions;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 1, 2};

        System.out.println("Original Array : " + Arrays.toString(arr));

        long inversions = countInversions(arr);

        System.out.println("Sorted Array   : " + Arrays.toString(arr));
        System.out.println("Inversions     : " + inversions);
    }
}