package dsalgos.arrays;

import java.util.Arrays;

public class NumberOfPairsSumK {

    public static void main(String[] args) {
        int[] nums = {3,1,5,1,1,1,1,1,2,2,3,2,2};
        System.out.println(maxOperations(nums, 1));
    }

    public static int maxOperations(int[] nums, int k) {
        /**
         1. Sort the array
         a) this helps in reducing the relevant input size
         2. Binary Search to find k
         a) reduce right index to not equal to k
         3. Now sum(lowest + highest)
         and acoordingly move from left to right
         and narrow down search space
         */

        //sort the array
        Arrays.sort(nums);
        int kIdx = findK(nums, k);

        int left = 0;
        int right = kIdx > 0 ? kIdx : nums.length-1;
        while(right > 0 && nums[right] == k) right--;

        // int right = nums.length-1;

        int count = 0;
        while(left < right) {
            int sum = (nums[left] + nums[right]);
            if(sum == k) {
                count++;
                left++;
                right--;
            } else if(sum < k){
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    private static int findK(int[] nums, int k) {
        System.out.println(Arrays.toString(nums));
        int low = 0;
        int high = nums.length-1;
        int mid = -1;
        while(low < high) {
            mid = low + (high-low)/2;
            if(nums[mid] == k) break;
            else if(nums[mid] < k) low++;
            else high--;
        }

        return nums[mid] == k ? mid-1 : -1;
    }
}