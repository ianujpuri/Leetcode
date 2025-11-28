package neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

    public static void main(String[] args) {

        EncodeDecode ed = new EncodeDecode();

        List<String> input = Arrays.asList(new String[]{"87oi9", "code", "love", "you"});

        String encoded = ed.encode(input);
        System.out.println("Encoded String : " + encoded);

        System.out.println("Decoded String : " + ed.decode(encoded));
    }

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String str : strs) {
            encoded.append(""+str.length());
            encoded.append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        char[] encodedString = str.toCharArray();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < encodedString.length; i++) {
            int n = encodedString[i] - '0';
            i++;
            int j = i;
            for(; j < i+n && j < encodedString.length; j++) {
                temp.append(encodedString[j]);
            }
            i = j-1;
            decoded.add(temp.toString());
            temp.setLength(0);
        }

        return decoded;
    }
}
