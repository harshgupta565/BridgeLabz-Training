package searching;
import java.util.Arrays;

public class ChallengeProblem {

    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                visited[arr[i]] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);

        Arrays.sort(arr);

        int index = binarySearch(arr, target);
        System.out.println("Index of Target: " + index);
    }
}
