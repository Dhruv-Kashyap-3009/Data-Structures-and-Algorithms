class Solution {
    public String winningPlayer(int x, int y) {
        int m = 0;
        while(x>0 && y>3){
            x--;
            y-=4;
            m++;
        }

        return m%2!=0?"Alice":"Bob";
    }
}