class Solution {
    private boolean DFS(char[][] board, int i, int j, String word, int idx, boolean[][] isVisited){
        int n = board.length;
        int m = board[0].length;

        if(i<0 || i>n-1 || j<0 || j>m-1) return false;
        if(isVisited[i][j]) return false;
        if (board[i][j] == word.charAt(idx) && idx == word.length() - 1) return true;
        if(board[i][j]!=word.charAt(idx)) return false;

        isVisited[i][j] = true;

        boolean flag = DFS(board, i-1, j, word, idx+1, isVisited) || DFS(board, i+1, j, word, idx+1, isVisited) ||
        DFS(board, i, j-1, word, idx+1, isVisited) || DFS(board, i, j+1, word, idx+1, isVisited);

        isVisited[i][j] = false;
        return flag;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] isVisited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!isVisited[i][j] && board[i][j]==word.charAt(0)){
                    if(DFS(board, i, j, word, 0, isVisited)) return true;
                }
            }
        }
        return false;
    }
}