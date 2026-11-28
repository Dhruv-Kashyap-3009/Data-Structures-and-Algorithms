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
    private TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;

        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);

        if(left!=null && right!=null) return root;
        else if(left!=null) return left;
        else return right;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode p = null;
        TreeNode q = null;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();

                if(i==0) p = node;
                if(i==size-1) q = node;

                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }

        return LCA(root, p, q);
    }
}