package dsalgos.arrays;

public class FirstUniqueChar {


    public static char solution(String str) {
        int[] bucket = new int[26];

        for(char c : str.toCharArray()) {
            bucket[c-'a']++;
        }

        for(int i = 0; i < bucket.length; i++) {
            if(bucket[i] == 1) {
               return (char) (i + 'a');
            }
        }

        return ' ';
    }
}
