class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for(int val : arr) sum+= val;

        int actualSum = n*(n+1)/2;

        return actualSum - sum;
    }
}