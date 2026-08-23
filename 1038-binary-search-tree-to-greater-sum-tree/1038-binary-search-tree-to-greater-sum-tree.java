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
    private int sum = 0;
    private void preOrder(TreeNode root){
        if(root==null) return;

        preOrder(root.right);
        sum+=root.val;
        root.val=sum;
        preOrder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        preOrder(root);
        return root;
    }
}