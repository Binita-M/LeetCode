package LeetCode.SlidingWindow;

public class NumSubArray {
    public int numSubArrayProductLessThanK(int[] nums, int k) {
        if(k<=0) {
            return 0;
        }

        int ans = 0;
        int left = 0;
        int currentProduct = 1;

        for(int right = 0; right < nums.length; right++) {
            currentProduct *= nums[right];
            while (currentProduct >= k) {
                currentProduct /= nums[left];
                left++;
            }
            ans +=right-left+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        NumSubArray numSubArray = new NumSubArray();
        int[] nums = {10,5,2,6};
        int k=100;

        int num = numSubArray.numSubArrayProductLessThanK(nums, k);
        System.out.println(num);
    }
}
