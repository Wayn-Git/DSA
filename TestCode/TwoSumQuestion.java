import java.util.Arrays;

public class TwoSumQuestion {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 3, 56, 6, 4};
        int target = 9;

        // Check if array is sorted
        boolean isSorted = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Sort if not sorted
        if (!isSorted) {
            Arrays.sort(nums);
        }

        // Two-pointer approach
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println("Pair: " + nums[left] + " + " + nums[right] + " = " + target);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
