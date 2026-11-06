class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = logs.length;
        int q = queries.length;
        int[] ans = new int[q];

        //Sorting Logs on the basis of time.
        Arrays.sort(logs, (a, b)-> Integer.compare(a[1], b[1]));

        //Storing the index of the each query originally and sorting it.
        int[][] queryTime = new int[q][2];
        for(int i=0;i<q;i++){
            queryTime[i][0] = queries[i];
            queryTime[i][1] = i;
        }
        Arrays.sort(queryTime, (a, b)-> Integer.compare(a[0], b[0]));

        //Sliding Window start = i, end = j;
        int i=0;
        int j=0;

        //Map for storing the original server ids in a particular time interval.
        Map<Integer, Integer> mp = new HashMap<>();

        //Sliding Window Execution
        for(int[] arr : queryTime){
            int start = arr[0] - x;
            int end = arr[0];

            //Expansion of Window
            while(j<m && logs[j][1]<=end){
                mp.put(logs[j][0], mp.getOrDefault(logs[j][0], 0) + 1);
                j++;
            }

            //Compression of Window
            while(i<m && logs[i][1]<start){
                mp.put(logs[i][0], mp.get(logs[i][0]) - 1);
                if(mp.get(logs[i][0]) == 0) mp.remove(logs[i][0]);
                i++;
            }

            //No. of unique servers with requests
            int serverRequests = mp.size();

            //Storing the answer of query at the correct index
            ans[arr[1]] = n - serverRequests;
        }

        return ans;
    }
}