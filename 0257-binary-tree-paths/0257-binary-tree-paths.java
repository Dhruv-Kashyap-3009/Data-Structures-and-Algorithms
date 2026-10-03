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
    private void solve(TreeNode root, String s, List<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s += root.val;
            ans.add(s);
            return;
        }

        solve(root.left, s+root.val+"->", ans);
        solve(root.right, s+root.val+"->", ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        solve(root, "", ans);
        return ans;
    }
}