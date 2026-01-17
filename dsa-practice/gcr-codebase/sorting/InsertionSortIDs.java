package sorting;
import java.util.Arrays;

public class InsertionSortIDs {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {105, 102, 110, 101};
        sort(ids);
        System.out.println(Arrays.toString(ids));
    }
}
