package dsalgos.arrays;

import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 0, 10, 0, 0, 20, 30, 0};
        arr = moveZeroes(arr);
        Arrays.stream(arr).forEach((e) -> System.out.print(e + " "));
    }

    public static int[] moveZeroes(int[] nums) {
        int counter = 0, zPos = 0;
        while (counter < nums.length) {
            if (nums[zPos] == 0) {
                while(counter < nums.length && nums[counter] == 0) {
                    counter++;
                }
                if(counter < nums.length) {
                    nums[zPos++] = nums[counter];
                    nums[counter++] = 0;
                }
            } else {
                zPos++;
                counter++;
            }
        }
        return nums;
    }



}
