package dsalgos.recursion;

public class PermutationsOfString {

    final static String TEXT = "ABC";
    public static void main(String[] args) {
        permutationsOfString(TEXT, 0);
    }

    static void permutationsOfString(String str, int fixedPosition) {
        if(fixedPosition == str.length()-1) {
            System.out.println(str);
        } else {

            for (int position = fixedPosition; position <= str.length() - 1; position++) {

                //swap current position of char with fixed position
                str = swap(str, position, fixedPosition);
                //now let's recurse for rest for string
                //i.e.  String from fixedPosition+1 to length-1
                permutationsOfString(str, fixedPosition + 1);

                //swap again to retain the original String
                //and repeat the process for other positions.
                str = swap(str, position, fixedPosition);
            }
        }
    }

    private static String swap(String str, int position, int fixedPosition) {
            char temp;
            char[] charArray = str.toCharArray();
            temp = charArray[position] ;
            charArray[position] = charArray[fixedPosition];
            charArray[fixedPosition] = temp;
            return String.valueOf(charArray);
    }


}
