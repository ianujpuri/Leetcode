package datastructures.bst;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BinarySearchTree {
    private static final int MAX_LEVEL = 6;

    private Node root;

    public BinarySearchTree(int data) {
        root = new Node(data, null);
    }

    public Node getRoot() {
        return this.root;
    }

    public Node insert(int data) {
        if(root == null) {
            root = new Node(data, null);
            return root;
        }

        Optional<Node> parent = mayFind(data);
        if(parent.isEmpty()) {
            throw new IllegalStateException("No parent found for this node " + data);
        }

        Node newNode = new Node(data, parent.get());
        if(parent.get().data > data) {
            parent.get().left = newNode;
        } else {
            parent.get().right = newNode;
        }

        return newNode;
    }

    public Optional<Node> mayFind(int data) {
        if(root == null) {
            return Optional.empty();
        }

        return mayFind(data, root);
    }

    private Optional<Node> mayFind(int data, Node node) {
        if(root == null || node == null) {
            return Optional.empty();
        }

        if(node.data > data) {
            if(node.left == null) {
                return Optional.of(node);
            }
            return mayFind(data, node.left);
        }

        if(node.data < data) {
            if (node.right == null ) {
                return Optional.of(node);
            }
            return mayFind(data, node.right);
        }

        return Optional.of(node);
    }

    private Optional<Node> extactFind(int data, Node node) {
        if(node == null) {
            return Optional.empty();
        }

        if(data == node.data) {
            return Optional.of(node);
        }

        if(data < node.data) {
            return extactFind(data, node.left);
        }

        return extactFind(data, node.right);
    }

    public Optional<List<Node>> traversalOrder() {
        return traversalOrder(root, new ArrayList<>());
    }

    public Optional<List<Node>> traversalOrder(Node node, List<Node> nodes) {
        if(root == null || node == null) {
            return Optional.of(nodes);
        }

        traversalOrder(node.left, nodes);
        nodes.add(node);
        traversalOrder(node.right, nodes);

        return Optional.of(nodes);
    }
    private Node subtreeFirst(Node node) {
        if(node == null) {
            return null;
        }

        Node pivot = node;
        while(pivot.left != null) {
            pivot = pivot.left;
        }

        return pivot;
    }

    public Node successor(Node node) {
        if(root == null || node == null) {
            return null;
        }

        if(node.right != null) {
            return subtreeFirst(node.right);
        }

        Node pivot = node;
        while(pivot.parent != null && !pivot.parent.left.equals( pivot)) {
            pivot = pivot.parent;
        }

        return pivot.parent;
    }

    public static class Node {
        int data;
        Node left;
        Node right;
        boolean isVisited = false;
        Node parent;

        public Node() {

        }

        public Node(int data, Node parent) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.parent = parent;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public void setIsVisited(boolean isVisited) {
            this.isVisited = isVisited;
        }

        public boolean isVisited() {
            return this.isVisited;
        }

        @Override
        public boolean equals(Object node) {
            return node instanceof Node n && this.data == n.data;
        }

        @Override
        public String toString() {
            return ""+this.data;
        }
    }
}
