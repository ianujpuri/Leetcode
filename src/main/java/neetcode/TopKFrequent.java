package neetcode;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;

public class TopKFrequent {

    public static void main(String[] args) {
        TopKFrequent topK = new TopKFrequent();
        int[] nums = {7, 7};
        Arrays.stream(topK.topKFrequent(nums, 1)).forEach(System.out::println);
    }

    /*
    time complexity O(n logn)
    space complexity O(n)
     */
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        final Map<Integer, Integer> frequencyMap = new HashMap<>();
        Arrays.stream(nums).forEach((e) -> {
            frequencyMap.put(e, frequencyMap.getOrDefault(e, 0)+1);
        });

        result = frequencyMap.entrySet()
                                .stream()
                                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                                .limit(k)
                                .mapToInt(Map.Entry::getKey)
                                .toArray();

        return result;
    }

}
