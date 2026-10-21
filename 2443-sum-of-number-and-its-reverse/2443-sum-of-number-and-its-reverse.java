class Solution {
    private int reverse(int n){
        int rev = 0;

        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }

        return rev;
    }
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=1;i<num;i++){
            int sum = i + reverse(i);

            if(sum==num) return true;
        }

        return false;
    }
}