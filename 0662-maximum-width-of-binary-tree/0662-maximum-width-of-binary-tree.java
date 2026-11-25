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
    long idx;
    TreeNode node;

    Pair(long idx, TreeNode node){
        this.idx = idx;
        this.node = node;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, root));

        int maxLen = 0;

        while(!q.isEmpty()){
            int size = q.size();

            long first = -1;
            long last = -1;

            for(int i=0;i<size;i++){
                TreeNode node = q.peek().node;
                long idx = q.peek().idx;
                q.poll();

                if(i==0) first = idx;
                if(i==size-1) last = idx;

                if(node.left!=null) q.offer(new Pair(idx * 2L + 1, node.left));
                if(node.right!=null) q.offer(new Pair(idx * 2L + 2, node.right));
            }

            maxLen = Math.max(maxLen, (int)(last - first + 1));
        }

        return maxLen;
    }
}