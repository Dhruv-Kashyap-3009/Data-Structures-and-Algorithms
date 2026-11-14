class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDeg = new int[numCourses];
        int[] ans = new int[numCourses];

        for(int i=0;i<numCourses;i++) adj.add(new ArrayList<>());
        for(int[] preq : prerequisites){
            adj.get(preq[1]).add(preq[0]);

            inDeg[preq[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(inDeg[i]==0) q.add(i);
        }

        int idx = 0;
        

        while(!q.isEmpty()){
            int node = q.poll();

            ans[idx++] = node;

            for(int neigh : adj.get(node)){
                inDeg[neigh]--;

                if(inDeg[neigh]==0) q.add(neigh);
            }
        }

        if(idx==numCourses) return ans;
        return new int[]{};
    }
}