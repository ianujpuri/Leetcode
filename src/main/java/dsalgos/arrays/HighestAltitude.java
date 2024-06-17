package dsalgos.arrays;

/**
 * There is a biker going on a road trip.
 * The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 *
 * You are given an integer array gain of length n where gain[i]
 * is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point.
 */
public class HighestAltitude {

    public int largestAltitude(int[] gain) {
        int max = 0;
        int alt = 0;
        for(int val : gain) {
            alt += val;
            if(max < alt) {
                max = alt;
            }
        }

        return max;
    }
}
