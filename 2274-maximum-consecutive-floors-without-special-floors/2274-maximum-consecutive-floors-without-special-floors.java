class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        if(top-bottom+1 == special.length) return 0;
        Arrays.sort(special);

        int ans = Integer.MIN_VALUE;

        ans = Math.max(ans, special[0] - bottom);

        for(int i=1;i<special.length;i++){
            ans = Math.max(ans, special[i] - special[i-1] - 1);
        }

        ans = Math.max(ans, top - special[special.length-1]);

        return ans;
    }
}