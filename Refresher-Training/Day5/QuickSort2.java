package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort2 {

    public static List<Integer> quickSort(List<Integer> arr) {

        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // Partition
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        // Recursively sort left and right
        left = quickSort(left);
        right = quickSort(right);

        // Merge
        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.add(pivot);
        result.addAll(right);

        // Print after every merge
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        return result;
    }

    public static void main(String[] args) {

        // Sample Input
        List<Integer> arr = Arrays.asList(5, 8, 1, 3, 7, 9, 2);

        quickSort(arr);
    }
}