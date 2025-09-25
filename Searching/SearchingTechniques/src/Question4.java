//Search the 'target' value in a 2D integer matrix of dimensions m*n and return true if found
//else return false. The matrix has following properties:-
//  Integer in each row are sorted from left to right.
//  The first integer of each row is greater than the last integer of the previous row.

import java.util.*;
class Question4{
    static boolean Search(int[][] matrix, int tar){
        int n=matrix.length,m=matrix[0].length;
        int st=0,end=n*m-1;
        while(st<=end){
            int mid=(st+end)/2;
            int midElt=matrix[mid/m][mid%m];
            if(midElt==tar)
                return true;
            if(tar<midElt)
                end=mid-1;
            else
                st=mid+1;
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