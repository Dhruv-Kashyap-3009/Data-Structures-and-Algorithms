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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null) return null;
        if(depth==1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        if(depth==2){
            TreeNode left = root.left;
            TreeNode right = root.right;

            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);
            root.left = newLeft;
            root.right = newRight;
            newLeft.left = left;
            newRight.right = right;
            return root;
        }

        root.left = addOneRow(root.left, val, depth-1);
        root.right = addOneRow(root.right, val, depth-1);

        return root;
    }
}