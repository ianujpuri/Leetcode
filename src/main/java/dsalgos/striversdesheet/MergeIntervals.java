package dsalgos.striversdesheet;

import java.util.*;

public class MergeIntervals {

    static final int START = 0;
    static final int END = 1;

    public static void main(String[] args) {
        List<Integer[]> intervals = new ArrayList<>();
        intervals.add(new Integer[]{1, 3});
        intervals.add(new Integer[]{4, 6});
        intervals.add(new Integer[]{7, 10});
        intervals.add(new Integer[]{11, 18});

        mergeIntervals(intervals).forEach(i -> {
            System.out.println(i[START] +" "+ i[END]);
        });
    }

    static List<Integer[]> mergeIntervals(List<Integer[]> intervals) {

        // edge case
        if(intervals == null || intervals.isEmpty() || intervals.size() == 1) return intervals;


        List<Integer[]> result = new ArrayList<>();

        intervals.sort(Comparator.comparingInt(a -> a[0]));

        int cursor = 0;
        int i = 1;
        for(; i < intervals.size(); i++) {
            if(intervals.get(cursor)[END] > intervals.get(i)[START]) {
                intervals.get(cursor)[END] = Math.max(intervals.get(cursor)[END], intervals.get(i)[END]);
            } else {
                result.add(intervals.get(cursor));
                cursor = i;
            }
        }

        //edge case
        result.add(intervals.get(cursor));

        return result;
    }
}
