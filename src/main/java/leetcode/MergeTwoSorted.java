package leetcode;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class MergeTwoSorted {

    public static void main(String[] args) {
        long[] nums1 = {5, 100, 105, 107};
        long[] nums2 = {50, 102, 106};

        mergeTwoSortedArraysWithoutExtraSpace(nums1, nums2);

        display(nums1);
        System.out.println();
        display(nums2);

    }

    public static void display(long[] arr) {
        Arrays.stream(arr).forEach(a -> System.out.print(a + " ,"));

    }

    public static void mergeTwoSortedArraysWithoutExtraSpace(long []nums1, long []nums2){
        int left = nums1.length-1;
        int right = 0;
        while(left >= 0 && right < nums2.length) {
            if(nums1[left] > nums2[right]) {
                long temp = nums1[left];
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
