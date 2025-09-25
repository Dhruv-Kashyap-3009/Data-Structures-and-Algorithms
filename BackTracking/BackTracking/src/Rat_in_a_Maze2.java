//Rat can move in all four directions
import java.util.*;

class Rat_in_a_Maze2{
    public static void printMaze(int sr,int sc, int er, int ec, String s, boolean[][] isVisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;

        //For moving Right
        printMaze(sr,sc+1,er,ec,s+"R", isVisited);

        //for moving left
        printMaze(sr,sc-1,er,ec,s+"L", isVisited);

        //for moving up
        printMaze(sr+1,sc,er,ec,s+"U", isVisited);

        //for moving down
        printMaze(sr-1,sc,er,ec,s+"D", isVisited);

        //backtracking
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        boolean[][] isVisited = new boolean[rows][cols];
        System.out.println("All routes are: ");
        printMaze(0,0,rows-1,cols-1,"", isVisited);
    }
}