package dsalgos.arrays;


public class KadeneAlgorithmMaxSum {

    public static void main(String[] args) {

        int[] nums = {10, 2, -4, -2, 7, 4, -4, 5};

        int[] nums1 = {-1, -2, -3, -4};
        int[] nums2 = {1, 2, 3, 4, -100};

        solution(nums);
    }


    public static int solution(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
//        for(int n : nums) {
//            sum = Math.max(n + sum, n);
//            maxSum = Math.max(maxSum, sum);
//        }

        for(int i =0; i<nums.length; i++) {
            if((sum + nums[i]) > 0 && (sum + nums[i] <= nums[i])) {
                sum = nums[i];
                start = i;
            } else {
                sum += nums[i];
            }

            if(maxSum < sum) {
                end = i ;
                maxSum = sum;
            }

        }

        System.out.println(" max Sum : " + maxSum + " start : " + start
         + " end : " + end);
        return maxSum;
    }
}
