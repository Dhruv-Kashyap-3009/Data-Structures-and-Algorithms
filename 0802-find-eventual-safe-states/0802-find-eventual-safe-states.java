class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int V = graph.length;

        List<List<Integer>> adj = new ArrayList<>();
        int[] inDeg = new int[V];

        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++){
            for(int neigh : graph[i]){
                adj.get(neigh).add(i);
                inDeg[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < V; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){

            int node = q.remove();
            ans.add(node);

            for(int neigh : adj.get(node)){
                inDeg[neigh]--;

                if(inDeg[neigh] == 0){
                    q.add(neigh);
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }
}