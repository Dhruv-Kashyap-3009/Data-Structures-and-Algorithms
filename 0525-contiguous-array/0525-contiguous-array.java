class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;

        int[] pref = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) sum+= -1;
            else sum+=1;

            pref[i] = sum;
        }

        int maxLen = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);

        for(int i=0;i<n;i++){
            if(!mp.containsKey(pref[i])) mp.put(pref[i], i);
            else{
                maxLen = Math.max(maxLen, i-mp.get(pref[i]));
            }
        }

        return maxLen;
    }
}