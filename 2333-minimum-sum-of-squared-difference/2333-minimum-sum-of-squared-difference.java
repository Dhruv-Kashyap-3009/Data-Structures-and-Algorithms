class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] freq = new int[100005];

        for(int i=0;i<nums1.length;i++){
            int val = Math.abs(nums1[i] - nums2[i]);

            freq[val]++;
        }
        
        int k = k1+k2;
        for(int i=freq.length-1;i>=0;i--){
            int countOps = Math.min(freq[i], k);

            freq[i] -= countOps;
            if(i!=0) freq[i-1] += countOps;

            k -= countOps;

            if(k==0) break;
        }

        long ans = 0L;

        for(int i=freq.length-1;i>=0;i--){
            ans += (long) i * i * freq[i];
        }

        return ans;
    }
}