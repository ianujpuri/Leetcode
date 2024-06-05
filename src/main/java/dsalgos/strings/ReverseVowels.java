package dsalgos.strings;

public class ReverseVowels {

        public static String reverseVowels(String s) {

            int left = 0, right = (s.length()-1);
            char[] arrChar = s.toCharArray();
            while(left < right) {
                while(left < right && isVowel(arrChar[left]))  { left++; }

                System.out.println("right "+ right);
                while(right > left && isVowel(arrChar[right])) {
                    right--;
                }

                char temp = arrChar[left];
                arrChar[left] = arrChar[right];
                arrChar[right] = temp;

                left++;
                right--;
            }

            return new String(arrChar);
        }

        private static boolean isVowel(char c) {

            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    return false;
                default:
                    return true;
            }
        }

    public static void main(String[] args) {
        String str = "hello";
        String result = reverseVowels(str);

        System.out.println(" result : " + result);
    }

}
