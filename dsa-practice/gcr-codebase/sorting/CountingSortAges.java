package sorting;
import java.util.Arrays;

public class CountingSortAges {
    static void sort(int[] arr) {
        int max = 18;
        int min = 10;
        int[] count = new int[max - min + 1];

        for (int age : arr) {
            count[age - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14};
        sort(ages);
        System.out.println(Arrays.toString(ages));
    }
}
