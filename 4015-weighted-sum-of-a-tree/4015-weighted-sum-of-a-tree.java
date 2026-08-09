class Solution {
    private int height;
    private long ans;

    private int getHeight(List<List<Integer>> children, int node) {
        int h = 1;

        for (int child : children.get(node)) {
            h = Math.max(h, 1 + getHeight(children, child));
        }

        return h;
    }

    private void dfs(List<List<Integer>> children, int[] arr, int node, int depth) {
        ans += (long) arr[node] * (height - depth + 1);

        for (int child : children.get(node)) {
            dfs(children, arr, child, depth + 1);
        }
    }

    public long weightedSum(int[] parent, int[] arr) {
        int n = parent.length;

        List<List<Integer>> children = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            children.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            children.get(parent[i]).add(i);
        }

        height = getHeight(children, 0);

        dfs(children, arr, 0, 1);

        return ans;
    }
}