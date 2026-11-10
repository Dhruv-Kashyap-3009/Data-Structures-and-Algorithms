class Solution {
    private boolean checkPosition(int x, int y, int m){
        return x>=0 && y>=0 && x<m && y<m;
    }

    public int[] executeInstructions(int m, int[] startPos, String s) {
        int n = s.length();
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            int x = startPos[0];
            int y = startPos[1];

            for(int j=i; j<n; j++){
                char c = s.charAt(j);

                if(c=='U') x--;
                else if(c=='D') x++;
                else if(c=='R') y++;
                else y--;

                if(!checkPosition(x, y, m)){
                    break;
                }

                ans[i]++;
            }
        }

        return ans;
    }
}