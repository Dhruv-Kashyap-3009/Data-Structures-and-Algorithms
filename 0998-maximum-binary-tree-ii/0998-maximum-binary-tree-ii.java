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
    private void inorder(TreeNode root, List<Integer> in){
        if(root==null) return ;

        inorder(root.left, in);
        in.add(root.val);
        inorder(root.right, in);
    }
    private int findMaxIdx(List<Integer> in, int st, int end){
        int maxIdx = st;

        for(int i=st;i<=end;i++){
            if(in.get(maxIdx)<in.get(i)) maxIdx = i;
        }

        return maxIdx;
    }
    private TreeNode buildTree(List<Integer> in, int st, int end){
        if(st>end) return null;

        int idx = findMaxIdx(in, st, end);
        TreeNode root = new TreeNode(in.get(idx));

        root.left = buildTree(in, st, idx-1);
        root.right = buildTree(in, idx+1, end);

        return root;
    }
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        List<Integer> in = new ArrayList<>();
        inorder(root, in);

        in.add(val);

        TreeNode newRoot = buildTree(in, 0, in.size()-1);

        return newRoot;
    }
}