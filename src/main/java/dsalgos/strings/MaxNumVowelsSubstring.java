package dsalgos.strings;

public class MaxNumVowelsSubstring {
        public int maxVowels(String s, int k) {
            int result = countVowels(s.substring(0, k));
            int left = 0; int right=k-1;
            char[] chars = s.toCharArray();
            int cur = result;
            while(right < chars.length-1) {
                cur = isVowel(chars[left++]) ? cur-1:cur;
                cur = isVowel(chars[++right]) ? cur+1:cur;

                result = result < cur ? cur : result;
            }


            return result;
        }

        public boolean isVowel(char c) {
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return true;
                default:
                    return false;
            }
        }

        public int countVowels(String s) {
            int count = 0;
            for(int i =0; i < s.length(); i++) {
                if(s.charAt(i) =='a' ||s.charAt(i) =='e'||s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u'){
                    count++;
                }

            }
            return count;
        }

}
