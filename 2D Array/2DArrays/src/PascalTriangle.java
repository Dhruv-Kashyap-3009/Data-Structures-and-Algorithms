//In Pascal Traingle, below element is sum of the upper two elements

import java.util.*;
class PascalTriangle{
    static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] Pascal(int n){
        int ans[][]=new int[n][];
        for(int i=0;i<n;i++){

            ans[i]=new int[i+1]; //Initializing no. for columns to be 1 more than row

            ans[i][0]=ans[i][i]=1;//Making the first and the last element of the row 0.

            for(int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int pascal[][]=Pascal(n);
        PrintMatrix(pascal);

    }
}