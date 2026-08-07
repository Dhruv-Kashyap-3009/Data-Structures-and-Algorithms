class Solution {
    private boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        int i = row;
        int j = col;

        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        i=row;
        j=col;

        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        i = row;
        j = col;

        while(i>=0){
            if(board[i][j]=='Q') return false;
            i--;
        }

        return true;
    }
    private void placeQueens(char[][] board, int n, int i, List<List<String>> ans){
        if(i==n){
            List<String> l = new ArrayList<>();
            for(int k=0;k<n;k++){
                String s = "";
                for(int j=0;j<n;j++){
                    s += board[k][j];
                }
                l.add(s);
            }
            ans.add(l);
            return;
        }

        for(int j=0;j<n;j++){
            if(isSafe(board, i, j)){
                board[i][j] = 'Q';
                placeQueens(board, n, i+1, ans);
                board[i][j] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] arr : board) Arrays.fill(arr, '.');

        List<List<String>> ans = new ArrayList<>();

        placeQueens(board, n, 0, ans);

        return ans;
    }
}