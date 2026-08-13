class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();

        int L = 0;
        long sum = 0;
        long max = 0;

        for(int R=0;R<n;R++){
            while(set.contains(arr[R])){
                set.remove(arr[L]);
                sum -= arr[L];
                L++;
            }

            set.add(arr[R]);
            sum += arr[R];

            if(R-L+1 == k){
                max = Math.max(max, sum);

                set.remove(arr[L]);
                sum -= arr[L];
                L++;
            }
        }

        return max;
    }
}