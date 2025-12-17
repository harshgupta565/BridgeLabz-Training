public class reverse_array {
    class ReverseArray {
        public static void main(String[] args) {

            int[] arr = {10, 20, 30, 40, 50};
            int n = arr.length;

            System.out.println("Original Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            // reversing the array
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }

            System.out.println("Answered  Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}