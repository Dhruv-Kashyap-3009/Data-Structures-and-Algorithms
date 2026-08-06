class Solution {
    private int productOfDigit(int n){
        int pro = 1;

        while(n!=0){
            pro *= (n%10);
            n/=10;
        }

        return pro;
    }
    public int smallestNumber(int n, int t) {
        while(productOfDigit(n)%t!=0) n++;

        return n;
    }
}