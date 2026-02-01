package LeetCode.TopInterviewQuestions.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge (int[][] intervals) {
       if (intervals.length <= 1) return intervals; //handling edge case

       //sorting intervals based on their start
       Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

       //list to store merged intervals dynamically
       List<int[]> result = new ArrayList<>();

       //taking first interval as current and adding in result list
       int[] current = intervals[0];
       result.add(current);

       //looping through the remaining intervals
       for (int i=1; i<intervals.length; i++) {
           int[] next = intervals[i]; //get next interval to compare

           //checking overlapping condition: next.start <= current.end
           if (next[0] <= current[1]) {
               current[1] = Math.max(current[1], next[1]); //merge intervals
           } else {
               current = next;
               result.add(current);
           }
       }
        //converting and returning arraylist to 2D array
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals mi = new MergeIntervals();
        //int[][] intervals = {{1, 3},{2,6},{8,10},{15,18}};
        int[][] intervals = {{1, 4},{4,5}};

        int[][] merged = mi.merge(intervals);

        System.out.println("Merged Intervals: ");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
