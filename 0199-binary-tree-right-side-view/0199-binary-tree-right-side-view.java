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
    private void inOrder(TreeNode root, List<Integer> ans, int depth){
        if(root==null) return;

        if(ans.size()<depth){
            ans.add(root.val);
        }

        inOrder(root.right, ans, depth+1);
        inOrder(root.left, ans, depth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        inOrder(root, ans, 1);

        return ans;
    }
}