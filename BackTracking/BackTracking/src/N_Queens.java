import java.util.*;
class N_Queens{
    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        String row="";
        List<String> boards= new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'Q')
                    row+='Q';
                else row+='.';
            }
            boards.add(row);
        }
        allBoards.add(boards);
    }
    public static boolean isSafe(int row, int col, char[][] board){
        //Horizontal
        for(int j=0;j<board[0].length;j++){
            if(board[row][j]=='Q') return false;
        }

        //Vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q') return false;
        }

        //Upper Left
        for(int r =row, c=col; r>=0 && c>=0; r--,c--){
            if(board[r][c]=='Q') return false;
        }

        //Lower Right
        for(int r =row, c=col; r<board.length && c<board[0].length; r++,c++){
            if(board[r][c]=='Q') return false;
        }

        //Lower left
        for(int r =row, c=col; r<board.length && c>=0; r++,c--){
            if(board[r][c]=='Q') return false;
        }

        //Upper Right
        for(int r =row, c=col; r>=0 && c<board[0].length; r--,c++){
            if(board[r][c]=='Q') return false;
        }

        return true;
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col==board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0;row< board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        List<List<String>> allBoards= solveNQueens(n);
        for(var i : allBoards){
            System.out.println(i);
        }
    }
}
