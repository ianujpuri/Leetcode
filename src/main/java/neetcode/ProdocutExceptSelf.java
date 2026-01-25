package neetcode;

import org.testng.Assert;

import java.util.Arrays;

public class ProdocutExceptSelf {

    public static void main(String[] args) {
        ProdocutExceptSelf prodocutExceptSelf = new ProdocutExceptSelf();
        int[] input = {1,2,3,4};
        int[] result = {24,12,8,6};
        Assert.assertEquals(result, prodocutExceptSelf.productExceptSelf(input));
    }

    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];

        prefix[0] = 1;
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[suffix.length-1] = 1;
        for(int i = nums.length-2;i >= 0;i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
