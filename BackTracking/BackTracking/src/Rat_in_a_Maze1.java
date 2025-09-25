//Two Directions: The Rat can only move in down and right direction
import java.util.*;

class Rat_in_a_Maze1 {
    public static void printMaze(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        //going down
        printMaze(sr+1 ,sc ,er ,ec ,s+"D");

        //going right
        printMaze(sr, sc+1, er ,ec ,s+"R");
    }

    public static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;

        int rightWays = maze(sr,sc+1,er,ec);
        int downWays = maze(sr+1, sc, er, ec);
        int totalWays = downWays + rightWays;

        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int count = maze(1,1,rows,cols);
        System.out.println(count);

        System.out.println("All routes are: ");
        printMaze(1,1,rows,cols,"");
    }
}