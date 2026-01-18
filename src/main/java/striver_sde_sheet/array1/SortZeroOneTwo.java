package striver_sde_sheet.array1;

import java.util.Arrays;

public class SortZeroOneTwo {


    public static void main(String[] args) {

        //Driver code
        int[] nums = {1,1,1,2,1,2,1,1,1};
//        sortWorst(nums);
//        sortBetter(nums);
        sortOptimal(nums);
        Arrays.stream(nums).forEach(e -> {
            System.out.print(e +" ");
        });
    }


    public static void sortWorst(int[] nums) {

        //sort 0's first
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    swap(nums, i, j);
                    break;
                }
            }
        }


        //sort 2's now, from the rightmost position
        for(int i = nums.length-1; i >= 0; i--) {
            for(int j = i; j >=0; j--) {
                if (nums[j] == 2) {
                    swap(nums, i, j);
                    break;
                }
            }
        }
    }


    public static void sortBetter(int[] nums) {

        int countZeros = 0;
        int countOnes = 0;

        for (int num : nums) {
            if (num == 0) countZeros++;
            if (num == 1) countOnes++;
        }


        for (int i=0; i < nums.length; i++) {
            if(i < countZeros) nums[i] = 0;
            else if(i < countZeros+countOnes) nums[i] = 1;
            else nums[i] = 2;
        }

    }

    public static void sortOptimal(int[] nums) {

        int zeroPointer = 0;
        int twoPointer = nums.length-1;

        for(int i=0; i <= Math.min(twoPointer, nums.length-1); ) {
            if(nums[i] == 0 && i != zeroPointer) {
                swap(nums, zeroPointer, i);
                zeroPointer++;
            } else if(nums[i] == 2 && i != twoPointer) {
                swap(nums, twoPointer, i);
                twoPointer--;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
