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
    private TreeNode buildTree(int[] arr, int start, int end){
        if(start>end) return null;
        if(start==end) return new TreeNode(arr[start]);

        int maxIdx = start;

        for(int i=start;i<=end;i++){
            if(arr[maxIdx]<arr[i]) maxIdx = i;
        }

        TreeNode root = new TreeNode(arr[maxIdx]);
        root.left = buildTree(arr, start, maxIdx-1);
        root.right = buildTree(arr, maxIdx+1, end);

        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] arr) {
        return buildTree(arr, 0, arr.length-1);
    }
}