package dsalgos.arrays;

public class RemoveElements {

    public static void main(String[] args) {
        int arr[] = {2};
        int val = 3;
        System.out.println(removeElement(arr, val));
    }
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0)
            return 0;

        int k = 0;
        int ptr = -1;
        for(int i = 0; i < nums.length;) {
            if(nums[i] == val) {
                ptr = ptr < 0 ? ptr = i : ptr;
                while(i < nums.length && nums[i++] != val);
            } else {
                if(ptr >= 0) {
                    nums[ptr] = nums[i];
                    ptr++;
                }
                k++;
                i++;
            }
        }

        return k;
    }
}
