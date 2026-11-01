class Solution {
    public long dividePlayers(int[] arr) {
        int n = arr.length;
        int sum = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        for(int val : arr) {
            sum += val;
            mp.put(val, mp.getOrDefault(val, 0) + 1);
        }

        if(sum % (n / 2) != 0) return -1;

        int target = sum / (n / 2);
        long chemistry = 0;

        for(int val : arr) {
            if(!mp.containsKey(val)) continue;

            int need = target - val;

            if(!mp.containsKey(need)) return -1;

            chemistry += (long) val * need;

            mp.put(val, mp.get(val) - 1);
            if(mp.get(val) == 0) mp.remove(val);

            mp.put(need, mp.get(need) - 1);
            if(mp.get(need) == 0) mp.remove(need);
        }

        return chemistry;
    }
}