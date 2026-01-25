package dsalgos.arrays;

import java.util.Arrays;

public class MergeSortedArraysInPlace {

    public static void main(String[] args) {
        int[] nums1 = {1, 5, 9, 10};
        int[] nums2 = {2, 3, 7, 8};
        solution(nums1, nums2);

        display(nums1);
        System.out.println();
        display(nums2);

    }

    public static void display(int[] nums) {
        Arrays.stream(nums).forEach((i) -> {System.out.print(" " + i);});
    }

    public static void solution(int[] nums1, int[] nums2) {

        /**
         * Array 1: [1, 5, 9, 10]
         * Array 2: [2, 3, 7, 8]
         */

        int left = nums1.length-1;
        int right = 0;

        while(left >=0 && right < nums2.length) {
            if(nums2[right] < nums1[left]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
            }

            left--;
            right++;

        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
}
