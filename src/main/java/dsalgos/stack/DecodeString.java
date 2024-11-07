package dsalgos.stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        // Traverse through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push everything except the closing bracket ']'
            if (ch != ']') {
                stack.push(ch);
            } else {
                // If we encounter ']', we need to decode the pattern
                // Step 1: Pop characters until '[' to get the encoded_string
                StringBuilder encodedString = new StringBuilder();
                while (stack.peek() != '[') {
                    encodedString.insert(0, stack.pop());
                }
                stack.pop(); // Remove the '[' from the stack

                // Step 2: Collect the number k (could be more than one digit)
                StringBuilder kString = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    kString.insert(0, stack.pop());
                }
                int k = Integer.parseInt(kString.toString()); // Convert k to an integer

                // Step 3: Repeat the encoded_string k times
                String repeatedString = encodedString.toString().repeat(k);

                // Step 4: Push the repeated result back onto the stack
                for (char c : repeatedString.toCharArray()) {
                    stack.push(c);
                }
            }
        }

        // Build the final result from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        DecodeString decoder = new DecodeString();
        // Test cases
        System.out.println(decoder.decodeString("3[a]2[bc]")); // Output: "aaabcbc"
        System.out.println(decoder.decodeString("3[a2[c]]"));  // Output: "accaccacc"
        System.out.println(decoder.decodeString("2[abc]3[cd]ef")); // Output: "abcabccdcdcdef"
    }
}

