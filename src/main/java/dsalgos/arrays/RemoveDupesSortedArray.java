package dsalgos.arrays;

public class RemoveDupesSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return -1;
        }

        int freePos = -1;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] != nums[i-1]) {
                if (freePos >= 0) {
                    nums[freePos] = nums[i];
                    freePos++;
                }
            } else {
                if(freePos == -1) {
                    freePos = i;
                }
            }
        }
        return freePos == -1 ? nums.length : freePos;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,6};
        int length = removeDuplicates(arr);
        System.out.println(" New lenth is  : " + length);
    }
}
