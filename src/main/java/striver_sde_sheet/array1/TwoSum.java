package striver_sde_sheet.array1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        Arrays.stream(twoSum(nums, 7)).forEach(value -> {
            System.out.print(value +" ");
        });
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), nums[i]};
            }

            map.put(target - nums[i], nums[i]);
        }

        return null;
    }
}
