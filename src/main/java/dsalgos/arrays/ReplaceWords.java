package dsalgos.arrays;

import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        for(String word : dictionary) {
            trie.insert(word);
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for(String word : words) {
            String prefix = trie.prefix(word);
            if(prefix != null && !prefix.isEmpty()) {
                result.append(prefix);
                result.append(" ");
            }
        }

        return result.toString().trim();
    }

}

class Trie {

    private static final char a = 'a';

    Node rootNode;

    Trie() {
    }

    public void insert(String str) {
        Node node = rootNode;

        for(char c : str.toCharArray()) {
            int index = c - a;
            if(rootNode == null) {
                rootNode = new Node();
                rootNode.add(index, node = new Node());
            } else {
                Node n;
                if( (n = node.get(index)) == null) {
                    n = new Node();
                }
                node.add(index, n);
                node = n;
            }
        }

        node.setIsLast(true);
    }

    public String prefix(String word) {

        if(rootNode == null) {
            return word;
        }

        StringBuilder prefix = new StringBuilder();

        int counter = 0;
        Node node = rootNode;
        for(char c : word.toCharArray()) {
            if(node.get(c-a) != null) {
                node = node.get(c-a);
                prefix.append(c);
            } else {
                prefix.setLength(0);
                prefix.append(word);
                break;
            }

            if(node.isLast) break;
        }

        return prefix.toString().isEmpty() ? word : prefix.toString();
    }

    static class Node {
        private final Node[] store = new Node[26];
        private boolean isLast = false;

        Node() {

        }

        void add(int index, Node node) {
            store[index] = node;
        }

        Node get(int index) {
            return store[index];
        }

        void setIsLast(boolean last) {
            isLast = last;
        }

        boolean isLast() {
            return isLast;
        }
    }
}
