package striver_sde_sheet.array1;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> values) {
        final Map<String, List<String>> groupMap = new HashMap<>();

        for(String v : values) {
            char[] chars = v.toCharArray();
            Arrays.sort(chars);

            String v1 = new String(chars);
            List<String> group = groupMap.get(v1);
            if (group == null) {
                List<String> list = new ArrayList<>();
                list.add(v);

                groupMap.put(v1, list);
            } else {
                groupMap.get(v1).add(v);
            }
        }


        return new ArrayList<>(groupMap.values());
    }
}
