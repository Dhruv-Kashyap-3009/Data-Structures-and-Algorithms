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
    private TreeNode bfs(TreeNode root, Map<TreeNode, TreeNode> parent, int start){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        TreeNode starter = null;

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node.val==start) starter = node;

            if(node.left!=null){
                q.add(node.left);
                parent.put(node.left, node);
            }
            if(node.right!=null){
                q.add(node.right);
                parent.put(node.right, node);
            }
        }

        return starter;
    }
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        TreeNode infected = bfs(root, parent, start);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(infected);

        boolean[] isVisited = new boolean[100005];
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                TreeNode node = q.poll();

                isVisited[node.val] = true;

                if(node.left!=null && !isVisited[node.left.val]) q.add(node.left);
                if(node.right!=null && !isVisited[node.right.val]) q.add(node.right);
                if(parent.containsKey(node) && !isVisited[parent.get(node).val]) q.add(parent.get(node));
            }
            level++;
        }

        return level-1;
    }
}