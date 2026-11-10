class Solution {
    long maxAns = 0;
    long totalSum = 0;
    static final int MOD = 1_000_000_007;

    private long splitTree(TreeNode root) {
        if (root == null) return 0;

        long left = splitTree(root.left);
        long right = splitTree(root.right);

        long sum = root.val + left + right;

        maxAns = Math.max(maxAns, sum * (totalSum - sum));

        return sum;
    }

    private long findTotalSum(TreeNode root) {
        if (root == null) return 0;

        return root.val + findTotalSum(root.left)
                + findTotalSum(root.right);
    }

    public int maxProduct(TreeNode root) {
        totalSum = findTotalSum(root);

        splitTree(root);

        return (int)(maxAns % MOD);
    }
}