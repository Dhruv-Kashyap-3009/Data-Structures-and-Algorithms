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
class Triplet{
    TreeNode node;
    int parent;
    int depth;

    Triplet(TreeNode node, int parent, int depth){
        this.node = node;
        this.parent = parent;
        this.depth = depth;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        int xParent = -1;
        int yParent = -1;
        int xDepth = -1;
        int yDepth = -1;

        Queue<Triplet> q = new LinkedList<>();

        q.add(new Triplet(root, -1, 0));

        while(!q.isEmpty()){
            TreeNode node = q.peek().node;
            int parent = q.peek().parent;
            int depth = q.peek().depth;
            q.remove();

            if(node.val==x){
                xParent = parent;
                xDepth = depth;
            }
            if(node.val==y){
                yParent = parent;
                yDepth = depth;
            }

            if(node.left!=null) q.add(new Triplet(node.left, node.val, depth+1));
            if(node.right!=null) q.add(new Triplet(node.right, node.val, depth+1));
        }

        if(xDepth==yDepth && xParent!=yParent) return true;
        return false;
    }
}