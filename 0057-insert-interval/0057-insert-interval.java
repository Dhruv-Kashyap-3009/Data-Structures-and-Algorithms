class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();

        int idx = 0;
        boolean isInserted = false;

        for(int i = 0; i < n; i++) {

            if(!isInserted && newInterval[1] < intervals[i][0]){
                list.add(newInterval);
                isInserted = true;
            }

            if(!isInserted && intervals[i][1] >= newInterval[0]){
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
            else if(isInserted || intervals[i][1] < newInterval[0]){
                list.add(intervals[i]);
            }
        }

        if(!isInserted){
            list.add(newInterval);
        }

        int size = list.size();
        int[][] ans = new int[size][2];

        for(int i = 0; i < size; i++){
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }

        return ans;
    }
}