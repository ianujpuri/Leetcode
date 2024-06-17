package dsalgos.binarytree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree, the level of its root is 1,
 * the level of its children is 2, and so on.
 * <p>
 * Return the smallest level x such that the sum of
 * all the values of nodes at level x is maximal.
 */
public class MaxLevelSum {

    Queue<TreeNode> q = new LinkedList<>();

    public int maxLevelSum(TreeNode root) {

        int maxSum = Integer.MIN_VALUE, result = 1;
        int level = 1;
        q.add(root);
        while (!q.isEmpty()) {
            int levelSum = 0;
            int size = q.size();
            for (int i = 1; i <= size; i++) {
                TreeNode node = q.remove();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);

                levelSum += node.val;
            }
            result = maxSum < levelSum ? level : result;
            maxSum = maxSum < levelSum ? levelSum : maxSum;
            level++;
        }

        return result;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
