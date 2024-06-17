package dsalgos.binarytree;

/**
 * Given the root of a binary tree and an integer targetSum,
 * return the number of paths where the sum of the values along
 * the path equals targetSum.
 * <p>
 * The path does not need to start or end at the root or a leaf,
 * but it must go downwards
 * (i.e., traveling only from parent nodes to child nodes).
 */
public class PathSumIII {

    int result = 0;

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null)
            return 0;

        findPath(root, 0, targetSum);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return result;
    }

    public void findPath(TreeNode root, double sum, int targetSum) {
        if (root == null)
            return;

        if ((sum + root.val) == targetSum) {
            result += 1;
        }


        findPath(root.left, sum + root.val, targetSum);
        findPath(root.right, sum + root.val, targetSum);
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
