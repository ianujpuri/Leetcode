package dsalgos.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    private static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};
        printAllSubsequences(nums1, nums2,0, 3, 0, 0, Integer.MAX_VALUE);
    }

    private static void printAllSubsequences(int[] nums, int[] nums2, int start, int k, int sum, int length, int min) {
        if(length == k) {
            System.out.println(sum);
        }

        for (int i = start; i < nums.length; i++) {

            sum += nums[i];
            min = Math.min(min, nums2[i]);
            printAllSubsequences(nums, nums2 , i + 1, k, sum,length+1,min);
            sum -= nums[i];

        }
    }

}
