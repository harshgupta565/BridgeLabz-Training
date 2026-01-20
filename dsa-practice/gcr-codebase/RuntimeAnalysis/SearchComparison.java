package RuntimeAnalysis;
import java.util.Arrays;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int N = 1_000_000;          // Dataset size
        int target = N - 1;         // Worst-case target
        int[] data = new int[N];

        // Fill dataset
        for (int i = 0; i < N; i++) {
            data[i] = i;
        }

        //Linear Search Timing
        long startLinear = System.nanoTime();
        linearSearch(data, target);
        long endLinear = System.nanoTime();

        long linearTime = endLinear - startLinear;

        //  Binary Search Timing
        Arrays.sort(data); // Required for binary search

        long startBinary = System.nanoTime();
        binarySearch(data, target);
        long endBinary = System.nanoTime();

        long binaryTime = endBinary - startBinary;

        // Output
        System.out.println("Dataset Size: " + N);
        System.out.println("Linear Search Time: " + linearTime / 1_000_000.0 + " ms");
        System.out.println("Binary Search Time: " + binaryTime / 1_000_000.0 + " ms");
    }
}
