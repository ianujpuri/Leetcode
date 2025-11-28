package leetcode.arraystuf;

public class LargestElement {

    /**
     * iterate array from 0 to n-1
     * compare with initial temp (Integer.MIN)
     * update larger
     *
     *
     * return result
     */


    public static void main(String[] args) {
        int[] arr1 = {3, 7, 2, 9, 5};
        System.out.println(findLargestElement(arr1));

        System.out.println("==========");
        int[] arr2 = {-10, -3, 0, 5, 2};
        System.out.println(findLargestElement(arr2));

        System.out.println("==========");
        int[] arr3 = {-8, -15, -2, -20, -5};
        System.out.println(findLargestElement(arr3));

        System.out.println("==========");
        int[] arr4 = {4, 9, 1, 9, 3, 9};
        System.out.println(findLargestElement(arr4));

        System.out.println("==========");
        int[] arr5 = {42};
        System.out.println(findLargestElement(arr5));

    }

    public static long findLargestElement(int[] nums) {

        if (nums.length == 1) { return nums[0]; }

        int result  = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {

            if(result < nums[i]) {
                result = nums[i];
            }
        }

        return result;
    }

}
