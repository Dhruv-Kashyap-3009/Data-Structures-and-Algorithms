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
    int count = 0;
    private void goodCount(TreeNode root, int max){
        if(root==null) return;

        if(max<=root.val) count++;

        max = Math.max(max, root.val);

        goodCount(root.left, max);
        goodCount(root.right, max);
    }
    public int goodNodes(TreeNode root) {
        goodCount(root, Integer.MIN_VALUE);

        return count;
    }
}