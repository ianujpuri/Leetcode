package dsalgos.binarytree;

import datastructures.bst.BinarySearchTree;

import java.util.Stack;

public class PreorderInterative {


    private static void iterativePreOrder(BinarySearchTree.Node root) {
        Stack<BinarySearchTree.Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            BinarySearchTree.Node node = stack.peek();
            if(node != null && node.isVisited()
                && (node.getLeft() == null || node.getLeft().isVisited())
                && (node.getRight() == null || node.getRight().isVisited())) {
                stack.pop();
            } else {
                System.out.print(node.getData() + " ");
                node.setIsVisited(true);

                if(node.getLeft() != null && node.getLeft().isVisited()) {
                    stack.push(node.getLeft());
                } else if(node.getRight() != null && node.getRight().isVisited()) {
                    stack.push(node.getRight());
                }
            }
        }
    }
}
