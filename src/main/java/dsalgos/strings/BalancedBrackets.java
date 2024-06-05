package dsalgos.strings;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "({[})";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> characterStack = new Stack<>();
        for(int i=0; i < s.length(); i++) {
            char c = characterStack.isEmpty() ? ' ' : characterStack.peek();
            if(map.containsKey(c) && map.get(c) == s.charAt(i))
                characterStack.pop();
            else
                characterStack.push(s.charAt(i));
        }

        return characterStack.isEmpty();
    }
}
