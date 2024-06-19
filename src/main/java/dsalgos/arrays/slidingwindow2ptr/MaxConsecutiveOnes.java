package dsalgos.arrays.slidingwindow2ptr;

public class MaxConsecutiveOnes {
        public int longestOnes(int[] nums, int k) {
            int cntZero = k, result = 0;
            int left=0; int right = 0;

            while(right < nums.length) {
                if(nums[right++] == 0) cntZero--;

                while(cntZero < 0) {
                    if(nums[left++] == 0) {
                        cntZero++;
                    }
                }

                result = Math.max(result, right-left);
                // right++;
            }

            return result;
        }
}
