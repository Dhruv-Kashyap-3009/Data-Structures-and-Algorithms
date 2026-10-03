/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Pair{
    TreeNode node;
    int dist;

    Pair(TreeNode node, int dist){
        this.node = node;
        this.dist = dist;
    }
}
class Solution {
    private void bfs(TreeNode root, Map<TreeNode, TreeNode> parent){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node.left!=null){
                q.add(node.left);
                parent.put(node.left, node);
            }
            if(node.right!=null){
                q.add(node.right);
                parent.put(node.right, node);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        bfs(root, parent);

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(target, 0));

        List<Integer> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[505];

        while(!q.isEmpty()){
            Pair iter = q.poll();
            TreeNode node = iter.node;
            int dist = iter.dist;

            isVisited[node.val] = true;

            if(dist==k){
                ans.add(node.val);
            }

            if(dist<k){
                if(node.left!=null && !isVisited[node.left.val]) q.add(new Pair(node.left, dist+1));
                if(node.right!=null && !isVisited[node.right.val]) q.add(new Pair(node.right, dist+1));
                if(parent.containsKey(node) && !isVisited[parent.get(node).val]) q.add(new Pair(parent.get(node), dist+1));
            }
        }

        return ans;
    }
}