package dsalgos.arrays;

public class CompressionString {

    public static void main(String[] args) {
        char chars[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println("\n"+compress(chars));
        System.out.println();

        char chars1[] = {'a','b','c','d' };
        System.out.println("\n"+compress(chars1));

        char chars2[] = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        System.out.println("\n"+compress(chars2));

    }

    public static int compress(char[] chars) {
        if (chars == null || chars.length == 1) return 1;

        int valIdx = 1;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
                if (count >= 10) {
                    chars[valIdx] = (char) 1;
                    valIdx++;
                    count = 1;
                }
            } else {
                if (count > 1) {
                    chars[valIdx] = String.valueOf(count).charAt(0);
                    valIdx +=2;
                } else {
                    valIdx+=1;
                }
                count = 1;
            }

        }
        if (count > 1) {
            System.out.println("val inx : " + valIdx + " count : " + count);
            chars[valIdx] = String.valueOf(count).charAt(0);
        }
        for(int i =0; i < valIdx; i++) {
            System.out.print(chars[i]+", ");
        }
        return (valIdx > 1 && count > 1 ? valIdx + 1:  valIdx);
    }
}
