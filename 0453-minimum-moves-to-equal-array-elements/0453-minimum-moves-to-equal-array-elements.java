class Solution {
    public int minMoves(int[] arr) {
        int min = Integer.MAX_VALUE;

        for(int val : arr) min = Math.min(min, val);

        int moves = 0;

        for(int val : arr) moves += val - min;

        return moves;
    }
}