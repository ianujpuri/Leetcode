package dsalgos.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static void main(String[] args) {
        int[] candies = {12,1,12};
        System.out.println(kidsWithCandies(candies, 10));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = -1;
        for(int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for( int j = 0; j < candies.length; j++) {
            if(max <= (candies[j]+extraCandies)) {
                max = candies[j]+extraCandies;
                result.add(j, true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
