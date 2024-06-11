package dsalgos.strings;

public class ValidateSubsequence {

        public boolean isSubsequence(String s, String t) {
            if(s.length() > 100) return false;

            int cur = 0;
            for(int i=0; i< t.length() && cur < s.length(); i++) {
                if(s.charAt(cur) == t.charAt(i)) {
                    cur++;
                }
            }

            return cur == s.length();
        }
}
