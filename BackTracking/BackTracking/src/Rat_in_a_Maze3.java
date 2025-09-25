//Rat in move in all four directions and there are also some blockers where the rat can not go.

import java.util.*;
class Rat_in_a_Maze3{
    public static void printMaze(int sr, int sc, int er, int ec, String s,int[][] maze){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc]==-1) return;

        maze[sr][sc]=-1;

        //For going right
        printMaze(sr,sc+1,er,ec,s+"R",maze);

        //For going left
        printMaze(sr,sc-1,er,ec,s+"L",maze);

        //For going down
        printMaze(sr+1,sc,er,ec,s+"D",maze);

        //For going up
        printMaze(sr-1,sc,er,ec,s+"U",maze);

        //Backtracking
        maze[sr][sc]=1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] maze = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};
        System.out.println("All routes are: ");
        printMaze(0,0,rows-1,cols-1,"",maze);
    }
}