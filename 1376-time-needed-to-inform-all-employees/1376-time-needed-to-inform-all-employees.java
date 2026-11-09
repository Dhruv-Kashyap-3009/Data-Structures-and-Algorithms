class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> children = new HashMap<>();

        for(int i=0;i<n;i++) children.put(i, new ArrayList<>());

        for(int i=0;i<n;i++){
            if(manager[i]==-1) continue;
            children.get(manager[i]).add(i);
        }

        Queue<int[]> q = new LinkedList<>();
        int maxTime = 0;

        q.offer(new int[]{headID, 0});

        while(!q.isEmpty()){
            int node = q.peek()[0];
            int time = q.peek()[1];
            q.poll();

            maxTime = Math.max(maxTime, time);

            for(int neigh : children.get(node)){
                int newTime = time + informTime[node];

                q.offer(new int[]{neigh, newTime});
            }
        }

        return maxTime;
    }
}