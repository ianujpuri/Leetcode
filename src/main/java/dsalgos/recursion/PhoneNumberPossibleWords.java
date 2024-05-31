package dsalgos.recursion;

import java.util.ArrayList;

public class PhoneNumberPossibleWords {

    static String[] inputPhonePad = {" ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz", ""};
    final static ArrayList<String> RESULT = new ArrayList<>();

    public static void main(String[] args) {
        int N = 5;
        int[] a = {5,8,8,9,8};
        System.out.println(possibleWords(a, N));
        System.out.println(RESULT.size());
    }
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int[] a, int N)
    {
        findPossibleWordsPhonePad(a, N, 0, "");
        return RESULT;
    }

    static void findPossibleWordsPhonePad(int[] a, int N, int parentIndex, String str) {

        if(parentIndex == N) {
            RESULT.add(str);
            return;
        }

        String input = inputPhonePad[a[parentIndex]-1];
        for(int i = 0; i < input.length(); i++) {
            findPossibleWordsPhonePad(a, N, parentIndex+1, str + input.charAt(i));
        }
    }


}
