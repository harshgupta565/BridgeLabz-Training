package sorting;
import java.util.Arrays;

public class SelectionSortScores {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
    }

    public static void main(String[] args) {
        int[] scores = {72, 85, 60, 90};
        sort(scores);
        System.out.println(Arrays.toString(scores));
    }
}
