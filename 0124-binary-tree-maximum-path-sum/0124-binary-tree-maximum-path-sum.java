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
    int ans = Integer.MIN_VALUE;
    private int pathSum(TreeNode root){
        if(root==null) return 0;

        int leftSum = pathSum(root.left);
        int rightSum = pathSum(root.right);

        ans = Math.max(ans, root.val + leftSum + rightSum);

        return Math.max(0, root.val + Math.max(leftSum, rightSum));
    }
    public int maxPathSum(TreeNode root) {
        pathSum(root);

        return ans;
    }
}