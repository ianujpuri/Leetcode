package dsalgos.arrays;

public class MaximumDifference {

    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(maximumDifference(arr));

        int[] arr1 = {30,20,10,3,1};
        System.out.println(maximumDifference(arr1));

        int[] arr2 = {10,20,30,40,50};
        System.out.println(maximumDifference(arr2));
    }

    public static int maximumDifference(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int min = nums[0];
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            result = Math.max(result, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        return result;
    }
}
