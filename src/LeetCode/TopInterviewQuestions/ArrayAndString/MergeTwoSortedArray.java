package LeetCode.TopInterviewQuestions.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray {
    public List<Integer> combiningTwoSortedArray(int [] array1, int[] array2) {
        List<Integer> combinedArray = new ArrayList<>();
        int i =0,  j=0;

        while (i<array1.length && j<array2.length)
            if (array1[i] < array2[j]){
            combinedArray.add(array1[i]);
            i++;
            }else {
            combinedArray.add(array2[j]);
            j++;
             }
        while (i<array1.length) {
            combinedArray.add(array1[i]);
            i++;
        }
        while (j<array2.length) {
            combinedArray.add(array2[j]);
            j++;
        }
       return combinedArray;
    }

    public static void main(String[] args) {
        MergeTwoSortedArray combiningTwoSortedArray = new MergeTwoSortedArray();
        int[] array1 = {1,3,5,9};
        int[] array2 = {2,4,6,7,10};

        List<Integer> result = combiningTwoSortedArray.combiningTwoSortedArray(array1, array2);
        System.out.println(result);
    }
}
