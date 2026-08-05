class Solution {
    private void dfs(int node, List<List<Integer>> adj, boolean[] sus){
        if(!sus[node]){
            sus[node] = true;

            for(int neigh : adj.get(node)) dfs(neigh, adj, sus);
        }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int[] r : invocations){
            int u = r[0];
            int v = r[1];

            adj.get(u).add(v);
        }

        boolean[] sus = new boolean[n];

        dfs(k, adj, sus);

        for(int[] r : invocations){
            int u = r[0];
            int v = r[1];

            if (!sus[u] && sus[v]) {
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!sus[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}