class Solution {
    public int longestSubsequence(int[] arr) {
        boolean isZero = true;
        int xor = 0;

        for(int val : arr){
            xor ^= val;

            if(val!=0) isZero = false;
        }

        if(isZero) return 0;
        else if(xor!=0) return arr.length;
        else return arr.length-1;
    }
}