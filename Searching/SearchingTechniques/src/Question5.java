//Write an efficient algorithm that searches for a value target in an m*n matrix. This matrix has the
//following properties:-
//  Integers in each row are sorted in ascending from left to right
//  Integers in each column are sorted in ascending from top to bottom.

import java.util.*;
class Question5{
    static boolean Search(int[][] matrix, int tar){
        int n=matrix.length,m=matrix[0].length;
        int i=0,j=m-1;

        while(i<n && j>=0){
            if(matrix[i][j]==tar)
                return true;
            if(tar<matrix[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("Enter target element: ");
        int tar=sc.nextInt();
        System.out.println(Search(matrix,tar));
    }
}