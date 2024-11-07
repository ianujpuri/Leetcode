package dsalgos.arrays;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] test1 = { 0 , 0 , 0};
        int[] test2 = { 190 , -5 , 23};
        int[] test3 = { -9, -1, -89 };
        System.out.println(maxSumSubArray(test1));
        System.out.println(maxSumSubArray(test2));
        System.out.println(maxSumSubArray(test3));
    }

    private static int maxSumSubArray(int[] arr) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for(int v : arr) {
            sum += v;
            result = Math.max(result, sum);
            if(sum < 0) {
                sum = 0;
            }
        }

        return result;
    }

    private static int maxSumSubArrayKaden(int[] arr) {
        if (arr == null || arr.length == 0) return 0; // Handle empty or null array

        int result = arr[0]; // Start with the first element to handle all-negative arrays
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Calculate maximum sum by including the current element or starting new from current
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            // Update result if currentMax is higher
            result = Math.max(result, currentMax);
        }

        return result;
    }
}
