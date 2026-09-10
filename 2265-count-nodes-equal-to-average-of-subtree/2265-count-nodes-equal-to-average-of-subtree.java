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
    private int nodeNumber(TreeNode root){
        if(root==null) return 0;
        return 1 + nodeNumber(root.left) + nodeNumber(root.right);
    }
    private int average(TreeNode root) {
        if (root == null) return 0;

        int sum = root.val + average(root.left) + average(root.right);
        int avg = sum / nodeNumber(root);

        if (avg == root.val) count++;

        return sum;
    }
    public int averageOfSubtree(TreeNode root) {
        average(root);
        return count;
    }
}