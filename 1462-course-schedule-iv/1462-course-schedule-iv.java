class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDeg = new int[numCourses];
        boolean[][] isReachable = new boolean[numCourses][numCourses];

        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            isReachable[u][v] = true;
            inDeg[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(inDeg[i]==0) q.offer(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();

            for(int neigh : adj.get(node)){

                for(int i=0;i<numCourses;i++){
                    if(isReachable[i][node]) isReachable[i][neigh] = true;
                }

                if(--inDeg[neigh] == 0) q.offer(neigh);
            }
        }

        List<Boolean> ans = new ArrayList<>();

        for(int[] query : queries){
            int u = query[0];
            int v = query[1];

            ans.add(isReachable[u][v]);
        }

        return ans;
    }
}