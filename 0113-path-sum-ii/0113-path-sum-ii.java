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
    private void solve(TreeNode root, int target, List<Integer> l, List<List<Integer>> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(target==root.val){
                l.add(root.val);
                ans.add(new ArrayList<>(l));
                l.remove(l.size()-1);
            }
            return;
        }

        l.add(root.val);
        solve(root.left, target-root.val, l, ans);
        solve(root.right, target-root.val, l, ans);
        l.remove(l.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();

        // if(targetSum==0) return paths;

        solve(root, targetSum, new ArrayList<>(), paths);

        return paths;
    }
}