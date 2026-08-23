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
    Map<Integer, Integer> mp = new HashMap<>();
    int max = 0;

    private int subTreeSum(TreeNode root){
        if(root==null) return 0;

        int left = subTreeSum(root.left);
        int right = subTreeSum(root.right);

        int sum = root.val + left + right;
        mp.put(sum, mp.getOrDefault(sum, 0)+1);
        max = Math.max(max, mp.get(sum));

        return sum;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null) return new int[]{};
        List<Integer> ans = new ArrayList<>();

        subTreeSum(root);

        for(int val : mp.keySet()){
            if(mp.get(val)==max){
                ans.add(val);
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}