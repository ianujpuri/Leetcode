package dsalgos.arrays;

class GCDStrings {

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        System.out.println(gcdOfStrings(str1, str2));
    }



    public static String gcdOfStrings(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty() || str1.charAt(0) != str2.charAt(0)) {
            return "";
        }

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdStrLength = gcdLength(str1.length(), str2.length());
        StringBuilder common = new StringBuilder(str1.substring(0, gcdStrLength));
        StringBuilder divisor = new StringBuilder(common);
        while(divisor.length() <= str1.length()) {
            if(divisor.toString().equals(str1)) {
                return common.toString();
            }
            divisor.append(common);
        }

        return "";
    }

    public static int gcdLength(int x, int y) {

        if(y == 0)
            return x;

        return gcdLength(y, x%y);
    }
}