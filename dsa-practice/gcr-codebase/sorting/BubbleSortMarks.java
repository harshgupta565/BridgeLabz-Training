package sorting;
import java.util.Arrays;

public class BubbleSortMarks {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {65, 90, 75, 88, 60};
        sort(marks);
        System.out.println(Arrays.toString(marks));
    }
}
