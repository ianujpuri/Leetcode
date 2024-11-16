package dsalgos.binarytree;

import datastructures.BinaryTree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PreorderInterative {


    private static void iterativePreOrder(BinaryTree.Node root) {
        Stack<BinaryTree.Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            BinaryTree.Node node = stack.peek();
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
