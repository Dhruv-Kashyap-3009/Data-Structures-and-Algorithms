class Solution {
    public boolean canAliceWin(int n) {
        int turn = 0;      
        int stonesToRemove = 10;
        while (n >= stonesToRemove) {
            n -= stonesToRemove;
            stonesToRemove--;  
            turn = 1 - turn;      
        }
        return turn == 1;
    }
}