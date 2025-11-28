package leetcode.arraystuf;

public class SecondSmallestAndLargest {


    public static void main(String[] args) {
        int[] arr1 = {3, 7, 2, 9, 5};
        printSecondSmallestAndSecondLargest(arr1);

        System.out.println("==========");
        int[] arr2 = {-10, -3, 0, 5, 2};
        printSecondSmallestAndSecondLargest(arr2);

        System.out.println("==========");
        int[] arr3 = {-8, -15, -2, -20, -5};
        printSecondSmallestAndSecondLargest(arr3);

        System.out.println("==========");
        int[] arr4 = {4, 9, 1, 9, 3, 9};
        printSecondSmallestAndSecondLargest(arr4);

        System.out.println("==========");
        int[] arr5 = {1,1,1,1};
        printSecondSmallestAndSecondLargest(arr5);
    }


    public static void printSecondSmallestAndSecondLargest(int[] nums) {

        /**
         * secondLargest, largest = min
         * secondSmallest, smallest = max
         *
         * loop from 0 to n-1
         * compare to largest, if bigger, update secondlargest to largest, and largest to ith
         * else compare to secondlargest and update it if bigger than i
         *
         * similarly compare smaller to smallest and secondsmallest
         */

        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for( int i =0 ; i < nums.length; i++) {

            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] >  secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }

            if(nums[i] <= smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            } else if(nums[i] < secondSmallest && nums[i] > smallest) {
                secondSmallest = nums[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE || secondSmallest == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }

        System.out.println("2nd largest  = " + secondLargest + " 2nd smallest = " + secondSmallest);
     }
}
