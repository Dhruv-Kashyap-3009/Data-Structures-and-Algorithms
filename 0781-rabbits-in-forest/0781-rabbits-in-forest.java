class Solution {
    public int numRabbits(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int val : arr){
            mp.put(val, mp.getOrDefault(val, 0) + 1);
        }

        int ans = 0;

        for(int key : mp.keySet()){
            int count = mp.get(key);
            int groupSize = key + 1;

            int groups = (count + groupSize - 1) / groupSize;

            ans += groups * groupSize;
        }

        return ans;
    }
}