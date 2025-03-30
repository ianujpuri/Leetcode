package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {


    }

    public static void solution(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        List<int[]> result  = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++) {
            if(result.isEmpty()) {
                result.add(intervals[i]);
            }  else {
                int[] first = result.get(result.size()-1);
                if(first[1] > intervals[i][0]) {
                    first[1] = intervals[i][1];
                } else {
                    result.add(intervals[i]);
                }
            }
        }

        result.stream().forEach((a) -> System.out.println(a[0] +" " + a[1]));
    }
}
