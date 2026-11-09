class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;

        while(x!=0 || y!=0){
            int a = x%2;
            int b = y%2;

            if(a!=b) count++;

            x = x>>1;
            y = y>>1;
        }

        return count;
    }
}