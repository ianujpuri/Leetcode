package striver_sde_sheet.array1;

import java.util.ArrayList;
import java.util.List;

public class PermutationsAll {

    private List<List<Integer>> result = new ArrayList<>();


    public static void main(String[] args) {
        PermutationsAll obj = new PermutationsAll();

        int[] nums = {1,2,3};
        obj.calculatePermutes(nums);

        obj.getResult().forEach(System.out::println);
    }

    private List<List<Integer>> getResult() {
        return result;
    }

    public void recurPermute(int[] nums, List<Integer> ds, boolean[] usageMap) {

        if(ds.size() == nums.length) {
            result.add(new ArrayList<>(ds));
            return;
        }


        // for each selection, start from 0 to consider all choices
        for(int i = 0; i < nums.length; i++) {

            if(!usageMap[i]) {

                //use the element
                ds.add(nums[i]);

                //mark the usage
                usageMap[i] = true;

                //recur from this selection
                recurPermute(nums, ds, usageMap);

                //remove last processed element
                ds.remove(ds.size()-1);

                //mark it as unused
                usageMap[i] = false;
            }
        }
    }

    public void calculatePermutes(int[] nums) {

        //declare ds to hold one output at a time
        List<Integer> ds = new ArrayList<>();

        //declare usage map
        boolean[] usageMap = new boolean[nums.length];

        recurPermute(nums, ds, usageMap);

    }


}
