package datastructures;

public class Trie {

    private static final char a = 'a';
    Node rootNode;


    Trie() {
    }

    public void insert(String str) {
        Node node = rootNode;

        int counter = 0;
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
            System.out.println(" adding word " + getChar(index));
            counter = index;
        }

        System.out.println(" node at " + counter + " is : " + node.get(counter));
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

    static char getChar(int index) {
        return (char)(index + a);
    }

    public static void main(String[] args) {
       String word = "cat";
       String word1 = "bate";
       String word2 = "rat";
       Trie trie = new Trie();
       trie.insert(word);
        trie.insert(word1);
        trie.insert(word2);
        System.out.println(trie.prefix("the"));
        System.out.println(trie.prefix("cattle"));
        System.out.println(trie.prefix("was"));
        System.out.println(trie.prefix("rattled"));
        System.out.println(trie.prefix("by"));
        System.out.println(trie.prefix("the"));
        System.out.println(trie.prefix("battery"));

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
