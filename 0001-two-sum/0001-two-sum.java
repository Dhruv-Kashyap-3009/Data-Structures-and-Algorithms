class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            int need = target-arr[i];

            if(mp.containsKey(need)){
                return new int[]{mp.get(need), i};
            }

            mp.put(arr[i], i);
        }

        return new int[]{};
    }
}