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
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode root = null;
        Map<Integer, TreeNode> nodes = new HashMap<>();
        Set<Integer> child = new HashSet<>();

        for(int[] a : descriptions) child.add(a[1]);

        for(int[] a : descriptions){
            if(!nodes.containsKey(a[0])){
                TreeNode newNode = new TreeNode(a[0]);
                nodes.put(a[0], newNode);

                if(!child.contains(a[0])) root = newNode;
            }

            if(!nodes.containsKey(a[1])){
                TreeNode newNode = new TreeNode(a[1]);
                nodes.put(a[1], newNode);
            }
        }

        for(int[] a : descriptions){
            if(a[2]==1){
                nodes.get(a[0]).left = nodes.get(a[1]);
            }else{
                nodes.get(a[0]).right = nodes.get(a[1]);
            }
        }

        return root;
    }
}