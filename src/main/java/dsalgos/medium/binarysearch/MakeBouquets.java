package dsalgos.medium.binarysearch;


/**
 * You are given an integer array bloomDay, an integer m and an integer k.
 * <p>
 * You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
 * <p>
 * The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
 * <p>
 * Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
 * Output: 3
 * Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
 * We need 3 bouquets each should contain 1 flower.
 * After day 1: [x, _, _, _, _]   // we can only make one bouquet.
 * After day 2: [x, _, _, _, x]   // we can only make two bouquets.
 * After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
 * Example 2:
 * <p>
 * Input: bloomDay = [1,10,3,10,2], m = 3, k = 2
 * Output: -1
 * Explanation: We need 3 bouquets each has 2 flowers, that means we need 6 flowers. We only have 5 flowers so it is impossible to get the needed bouquets and we return -1.
 * Example 3:
 * <p>
 * Input: bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
 * Output: 12
 * Explanation: We need 2 bouquets each should have 3 flowers.
 * Here is the garden after the 7 and 12 days:
 * After day 7: [x, x, x, x, _, x, x]
 * We can make one bouquet of the first three flowers that bloomed. We cannot make another bouquet from the last three flowers that bloomed because they are not adjacent.
 * After day 12: [x, x, x, x, x, x, x]
 * It is obvious that we can make two bouquets in different ways.
 */
public class MakeBouquets {

    int ptr = 0;

    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;

        int minDay = 1;//minFinder(bloomDay);
        int maxDay = maxFinder(bloomDay);
        int mid = 0;
        int result = -1;
        while (minDay <= maxDay) {
            mid = (minDay + maxDay) / 2;
            if (bouquetsCheck(bloomDay, mid, m, k)) {
                maxDay = mid - 1;
                result = mid;
            } else {
                minDay = mid + 1;
            }
        }

        return result;
    }

    public boolean bouquetsCheck(int[] nums, int day, int m, int k) {
        int counter = 0, bqs = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= day) {
                counter += 1;
            } else {
                bqs += (counter / k);
                counter = 0;
            }

            if (bqs == m) return true;
        }

        bqs += (counter / k);
        return bqs >= m;
    }

    public int minFinder(int[] bloomDay) {
        int min = Integer.MAX_VALUE;
        for (int val : bloomDay) {
            min = min > val ? val : min;
        }

        return min;
    }

    public int maxFinder(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int val : bloomDay) {
            max = max < val ? val : max;
        }

        return max;
    }
}
