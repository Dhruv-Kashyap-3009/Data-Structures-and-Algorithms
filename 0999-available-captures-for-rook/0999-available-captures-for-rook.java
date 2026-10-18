class Solution {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'R') {
                    count += upCheck(i, j, board) ? 1 : 0;
                    count += downCheck(i, j, board) ? 1 : 0;
                    count += rightCheck(i, j, board) ? 1 : 0;
                    count += leftCheck(i, j, board) ? 1 : 0;
                }
            }
        }
        return count;
    }
    
    public static boolean upCheck(int m, int n, char[][] board) {
        for(int i = m; i >= 0; i--) {
            if(board[i][n] == 'p') {
                return true;
            } else if(board[i][n] == 'B') {
                return false;
            }
        }
        return false;
    }
    
    public static boolean downCheck(int m, int n, char[][] board) {
        for(int i = m; i < 8; i++) {
            if(board[i][n] == 'p') {
                return true;
            } else if(board[i][n] == 'B') {
                return false;
            }
        }
        return false;
    }
    
    public static boolean leftCheck(int m, int n, char[][] board) {
        for(int i = n; i >= 0; i--) {
            if(board[m][i] == 'p') {
                return true;
            } else if(board[m][i] == 'B') {
                return false;
            }
        }
        return false;
    }
    
    public static boolean rightCheck(int m, int n, char[][] board) {
        for(int i = n; i < 8; i++) {
            if(board[m][i] == 'p') {
                return true;
            } else if(board[m][i] == 'B') {
                return false;
            }
        }
        return false;
    }
}