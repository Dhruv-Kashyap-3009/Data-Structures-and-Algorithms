class Solution {
    private int countSubarray(int[] arr, int k){
        int n = arr.length;

        int l = 0;
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int r=0;r<n;r++){
            mp.put(arr[r], mp.getOrDefault(arr[r], 0) +1);

            while(mp.size()>k){
                mp.put(arr[l], mp.get(arr[l])-1);
                if(mp.get(arr[l])==0) mp.remove(arr[l]);
                l++;
            }

            count+= r-l+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] arr, int k) {
        return countSubarray(arr, k) - countSubarray(arr, k-1);
    }
}