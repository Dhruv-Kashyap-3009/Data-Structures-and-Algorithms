class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int a = 0;
        int b = 1;

        while(n-- > 0){
            int temp = a+b;
            a = b;
            b = temp;
        }

        return a;
    }
}