class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;

        for(int i=0;i<k;i++) sum+= arr[i];
        int maxSum = sum;
        
        int front = k-1;
        int back = n-1;

        while(front>=0){
            sum = sum + arr[back--] - arr[front--];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}