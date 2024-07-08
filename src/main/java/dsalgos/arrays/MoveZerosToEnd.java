package dsalgos.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {8, 5, 0, 0, 10, 0, 0, 20, 30, 0};
        int[] arr1 = moveZeroes(arr);
        Arrays.stream(arr1).forEach((e) -> System.out.print(e + " "));

        System.out.println();

        int[] arr2 = moveZeroesConcise(arr);
        Arrays.stream(arr2).forEach((e) -> System.out.print(e + " "));
    }

    public static int[] moveZeroes(int[] nums) {
        int counter = 0, zPos = 0;
        while (counter < nums.length) {
            if (nums[zPos] == 0) {
                while (counter < nums.length && nums[counter] == 0) {
                    counter++;
                }
                if (counter < nums.length) {
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

    public static int[] moveZeroesConcise(int[] nums) {
        int counter = 0;
        for (int pos = 0; pos < nums.length; pos++) {
            if (nums[pos] != 0) {
                int temp = nums[counter];
                nums[counter++] = nums[pos];
                nums[pos] = temp;
            }
        }
        return nums;
    }

}
