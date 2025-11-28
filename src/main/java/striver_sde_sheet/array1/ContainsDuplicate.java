package striver_sde_sheet.array1;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        System.out.println(containsDuplicate(arr1));
    }

    private static boolean containsDuplicate(final int[] nums) {
        int value = 0;

        for(int i=0; i< nums.length; i++) {

           if((value & (1 << nums[i])) != 0) {
               return true;
           }

           value = value | (1 << nums[i]);
        }

        return false;
    }
}
