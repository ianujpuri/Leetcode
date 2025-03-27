package leetcode;

public class FindRepeatedOne {

    public static void main(String[] args) {
        int[] arr = {3,3,4,2,1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] nums) {

        int result = -1;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[nums[i]%n] > n) {
                result = nums[i]%n;
                break;
            }

            nums[nums[i]%n] += n;
        }

        return result;
    }
}
