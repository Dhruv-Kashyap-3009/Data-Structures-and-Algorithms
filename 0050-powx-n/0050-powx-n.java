class Solution {
    private double binaryExp(double x, long n){
        if(n==1) return x;
        if(n==0) return 1;
        if(n<0) return 1/binaryExp(x, -n);

        if(n%2==0){
            return binaryExp(x*x, n/2);
        }else{
            return x* binaryExp(x*x, n/2);
        }
    }
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(n==1) return x;

        return binaryExp(x, (long)n);
    }
}