/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int count = 0;
    private void countPath(TreeNode root, long sum, int targetSum) {
        if (root == null) return;

        sum += root.val;

        if (sum == targetSum) count++;

        countPath(root.left, sum, targetSum);
        countPath(root.right, sum, targetSum);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        countPath(root, 0, targetSum);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }
}