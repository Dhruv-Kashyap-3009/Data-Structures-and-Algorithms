class Solution {
    public int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int target = arr[n/2];
        int moves = 0;

        for(int val : arr){
            moves += Math.abs(val - target);
        }

        return moves;
    }
}