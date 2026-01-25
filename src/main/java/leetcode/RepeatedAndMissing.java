package leetcode;

import java.util.Arrays;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        int[] nums = {2,1,2,5,3};
        findRepeatedAndMissing(nums);
    }

    public static void findRepeatedAndMissing(int[] nums) {

        int[] nums1 = Arrays.copyOf(nums, nums.length);
        int repeated = FindRepeatedOne.solution(nums);
        int sum = 0;
        for(int e : nums1) {
            sum += e;
        }
        sum -= repeated;
        System.out.println("Sum : " + sum);


        int expectedSum  = (nums.length) * ((nums.length) +1)/2;
        System.out.println("Sum : " + expectedSum);

        System.out.println("Repeated : " + repeated + " Missing : " + (expectedSum-sum));
    }
}
