public class RemoveDuplicates {

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3};

        Solution solution = new Solution();
        int k = solution.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + k);

        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
