class Solution {
    private boolean solve(int[] arr, int i, long target, long pro){
        if(target==pro) return true;
        if(pro>target) return false;
        if(i>=arr.length) return false;
        
        boolean take = solve(arr, i+1, target, pro*(long)arr[i]);
        boolean skip = solve(arr, i+1, target, pro);

        return take || skip;
    }
    public boolean checkEqualPartitions(int[] arr, long target) {
        long pro = 1;

        for(int val : arr) pro *= (long)val;

        if(pro!=target*target) return false;

        return solve(arr, 0, target, 1L);
    }
}