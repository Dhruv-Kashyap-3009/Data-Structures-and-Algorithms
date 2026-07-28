class Solution {
    public int reverse(int x) {
        boolean flag = (x>0)?true:false;
        x = Math.abs(x);
        int rev = 0;
        while(x>0){
            int rem = x%10;
            x/=10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            rev = (rev*10)+rem;
        }
        if(flag==true) return rev;
        else return rev*(-1);
    }
}