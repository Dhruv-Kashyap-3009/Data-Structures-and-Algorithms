class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp = new HashMap<>();

        for(String s : words) mp.put(s, mp.getOrDefault(s, 0)+1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (!mp.get(a).equals(mp.get(b))) {
                return mp.get(b) - mp.get(a);
            }
            return a.compareTo(b);
        });

        for(String s : mp.keySet()) pq.add(s);

        List<String> ans = new ArrayList<>();

        while(!pq.isEmpty() && ans.size() != k){
            ans.add(pq.remove());
        }

        return ans;
    }
}