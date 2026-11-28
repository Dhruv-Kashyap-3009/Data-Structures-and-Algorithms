
class Solution {
    private int dfs(List<List<Integer>> adj, int node, int parent, List<Boolean> hasApple) {
        int ans = 0;

        for (int child : adj.get(node)) {
            if (child == parent) continue;

            int childAns = dfs(adj, child, node, hasApple);

            if (childAns != 0) {
                ans += childAns + 2;
            } 
            else if (hasApple.get(child)) {
                ans += 2;
            }
        }

        return ans;
    }

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return dfs(adj, 0, -1, hasApple);
    }
}
