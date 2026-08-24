class Solution {
    private int ans = 0;

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        sum = sum * 2 + root.val;

        if (root.left == null && root.right == null) {
            ans += sum;
            return;
        }

        dfs(root.left, sum);
        dfs(root.right, sum);
    }

    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
}