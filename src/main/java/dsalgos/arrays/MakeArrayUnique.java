package dsalgos.arrays;

/**
 * You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.
 *
 * Return the minimum number of moves to make every value in nums unique.
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2]
 * Output: 1
 * Explanation: After 1 move, the array could be [1, 2, 3].
 */
public class MakeArrayUnique {

    public int minIncrementForUnique(int[] nums) {

        // Arrays.sort(nums);
        // return minIncUsingSortOnly(nums);
        return minIncUsingCounting(nums);
    }

    public int minIncUsingSortOnly(int[] nums) {
        int moves = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]) {
                moves += ((nums[i-1]+1) - nums[i]);
                nums[i] += ((nums[i-1]+1) - nums[i]);
            }
        }
        return moves;
    }

    public int minIncUsingCounting(int[] nums) {

        int moves = 0;
        int max = 0;
        for(int val : nums) {
            max = max < val ? val : max;
        }

        int[] bucket = new int[max+nums.length+1];
        for(int i=0; i < nums.length; i++) {
            bucket[nums[i]] += 1;
        }

        for(int i = 1; i < bucket.length; i++) {
            if(bucket[i-1] > 1) {
                bucket[i] += (bucket[i-1] - 1);
                moves +=  (bucket[i-1] - 1);
            }

        }
        return moves;
    }
}
