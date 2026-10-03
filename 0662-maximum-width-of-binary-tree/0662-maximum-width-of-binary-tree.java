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
    int index;

    Pair(TreeNode node, int index){
        this.node = node;
        this.index = index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        int max = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            int size = q.size();

            int min = q.peek().index;
            int first = 0;
            int last = 0;

            for(int i=0;i<size;i++){
                Pair p = q.poll();
                TreeNode node = p.node;
                int cur_id = p.index - min;

                if(i==0) first = p.index;
                if(i==size-1) last = p.index;

                if(node.left!=null) q.add(new Pair(node.left, cur_id*2+1));
                if(node.right!=null) q.add(new Pair(node.right, cur_id*2+2));
            }

            max = Math.max(max, last-first+1);
        }

        return max;
    }
}