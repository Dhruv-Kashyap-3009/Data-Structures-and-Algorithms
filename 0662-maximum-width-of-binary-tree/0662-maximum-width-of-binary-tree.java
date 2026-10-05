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
class Pair{
    TreeNode node;
    long index;

    Pair(TreeNode node, long index){
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        long maxWidth = 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0L));

        while(!q.isEmpty()){
            int size = q.size();

            long first = 0;
            long last = 0;

            for(int i=0;i<size;i++){
                TreeNode node = q.peek().node;
                long index = q.peek().index;
                q.poll();

                if(i==0) first = index;
                if(i==size-1) last = index;

                if(node.left!=null) q.add(new Pair(node.left, index*2L+1L));
                if(node.right!=null) q.add(new Pair(node.right, index*2L+2L));
            }

            maxWidth = Math.max(maxWidth, last-first+1);
        }

        return (int) maxWidth;
    }
}