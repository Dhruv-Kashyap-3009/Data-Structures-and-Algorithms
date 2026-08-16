class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;

        int min = Integer.MAX_VALUE;
        int minIdx = -1;

        for(int i=0;i<n;i++){
            int dist = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);

            if(dist <= drones[i][2]){
                if(min > dist){
                    min = dist;
                    minIdx = i;
                }
            }
        }

        return minIdx;
    }
}