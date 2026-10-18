class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] board = new int[8][8];
        for(int[] rows: queens){
            board[rows[0]][rows[1]] = 1;
        }
        
        int x = king[0], y = king[1];
        for(int dx = -1;dx<=1;dx++){
            for(int dy=-1;dy<=1;dy++){
                if(dx == 0 && dy == 0) continue;
                x = king[0];
                y = king[1];
                while(x+dx >= 0 && y+dy >= 0 && x+dx <= 7 && y+dy <= 7){
                    x += dx;
                    y += dy;
                    if(board[x][y] == 1){
                        List<Integer> a = new ArrayList<>();
                        a.add(x);
                        a.add(y);
                        ans.add(a);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}