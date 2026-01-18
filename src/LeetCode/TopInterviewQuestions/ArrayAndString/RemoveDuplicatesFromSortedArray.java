package LeetCode.TopInterviewQuestions.ArrayAndString;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int k=1;

        for(int i=1; i<nums.length; i++) {
            if (nums[i]!=nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,2,3,3,4,5,6,6};

        int result = rdfsa.removeDuplicates(nums);
        System.out.println(result);
    }
}
