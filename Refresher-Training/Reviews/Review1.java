package Reviews;
public class Review1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 25, 63, 65};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Invalid Input");
        }
        else{
            System.out.println(secondLargest);

        }
    }
}