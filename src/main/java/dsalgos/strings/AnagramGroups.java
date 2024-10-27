package dsalgos.strings;

import java.lang.reflect.Array;
import java.util.*;

public class AnagramGroups {

    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        /**
         for each string
         sort it
         add sorted string to map as key
         and orginal string to the list as value

         return values of map, list of list
         */

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {

            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            if(map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> group = new ArrayList<String>();
                group.add(str);
                map.put(key, group);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(List group : map.values()) {
            result.add(group);
        }

        return result;
    }
}