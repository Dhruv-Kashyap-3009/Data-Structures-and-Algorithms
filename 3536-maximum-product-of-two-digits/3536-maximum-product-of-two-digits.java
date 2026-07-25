class Solution {
    public int maxProduct(int n) {
        int size = ((int)Math.log10(n))+1;
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = n%10;
            n/=10;
        }

        Arrays.sort(arr);
        return arr[size-1]*arr[size-2];
    }
}