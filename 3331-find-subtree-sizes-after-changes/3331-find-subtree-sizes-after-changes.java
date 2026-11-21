class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        List<Integer>[] tree = new ArrayList[n];
        for (int i = 0; i < n; i++) tree[i] = new ArrayList<>();

        for (int i = 1; i < n; i++)
            tree[parent[i]].add(i);

        int[] newParent = parent.clone();

        int[] last = new int[26];
        Arrays.fill(last, -1);

        dfs(0, s, tree, newParent, last);

        List<Integer>[] newTree = new ArrayList[n];
        for (int i = 0; i < n; i++) newTree[i] = new ArrayList<>();

        for (int i = 1; i < n; i++)
            newTree[newParent[i]].add(i);

        int[] ans = new int[n];
        calcSize(0, newTree, ans);

        return ans;
    }

    void dfs(int u, String s, List<Integer>[] tree, int[] newParent, int[] last) {
        int ch = s.charAt(u) - 'a';
        int prev = last[ch];

        if (prev != -1)
            newParent[u] = prev;

        last[ch] = u;

        for (int v : tree[u])
            dfs(v, s, tree, newParent, last);

        last[ch] = prev;
    }

    int calcSize(int u, List<Integer>[] tree, int[] ans) {
        int size = 1;

        for (int v : tree[u])
            size += calcSize(v, tree, ans);

        return ans[u] = size;
    }
}