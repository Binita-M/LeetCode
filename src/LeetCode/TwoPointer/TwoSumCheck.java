package LeetCode.TwoPointer;

import java.util.Arrays;

public class TwoSumCheck {
    public boolean checkForTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                return true;
            }
            if (currentSum > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TwoSumCheck twoSumCheck = new TwoSumCheck();

        //int[] nums = {1,2,3,4,5,9,14,15};
        int[] nums = {10, 1,2,3,6,4,5,9,14,15};
        Arrays.sort(nums);
        int target = 13;

        boolean result = twoSumCheck.checkForTarget(nums, target);

        if (result) {
            System.out.println("Two numbers with target sum exists.");
        } else {
            System.out.println("No two numbers with target sum exists.");
        }

    }
}
