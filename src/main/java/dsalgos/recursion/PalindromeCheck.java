package dsalgos.recursion;

public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aaaavbaaaa"));
    }
    static boolean isPalindrome(String s) {

        if(s.length() == 0 || s.length() == 1) {
            return true;
        }

        return isPalindrome(s, 0, s.length()-1);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if(start >= end) {
            return true;
        } else if(s.charAt(start) == s.charAt(end)) {
            return isPalindrome(s, start+1, end-1);
        }

        return false;
    }
}
