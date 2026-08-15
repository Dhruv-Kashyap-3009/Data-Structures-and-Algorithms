class Solution {
    public int totalFruit(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();

        int l = 0;
        int maxLen = 0;
        
        for(int r=0;r<n;r++){
            mp.put(arr[r], mp.getOrDefault(arr[r], 0) + 1);

            while(mp.size() > 2){
                mp.put(arr[l], mp.get(arr[l])-1);
                if(mp.get(arr[l])==0) mp.remove(arr[l]);
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);
        }

        return maxLen;
    }
}