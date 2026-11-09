class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        List<Integer> ans = new ArrayList<>();
        int n = arrival.length;
        int[] noOfRequests = new int[k];

        TreeSet<Integer> available = new TreeSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < k; i++) {
            available.add(i);
        }

        int maxRequests = 0;

        for (int i = 0; i < n; i++) {
            int time = arrival[i];

            while (!pq.isEmpty() && pq.peek()[1] <= time) {
                available.add(pq.poll()[0]);
            }

            if (available.isEmpty()) continue;

            int preferred = i % k;

            Integer server = available.ceiling(preferred);

            if (server == null) {
                server = available.first();
            }

            available.remove(server);

            noOfRequests[server]++;

            maxRequests = Math.max(maxRequests, noOfRequests[server]);

            pq.add(new int[]{server, time + load[i]});
        }

        for (int i = 0; i < k; i++) {
            if (noOfRequests[i] == maxRequests) {
                ans.add(i);
            }
        }

        return ans;
    }
}