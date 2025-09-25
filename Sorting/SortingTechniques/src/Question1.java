//Given an integer array arr, moave all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Eg:-  0 5 0 3 42 -->  5 3 42 0 0

import java.util.*;
class Question1{
    static void Sorting(int[] arr){
        int n=arr.length,temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of Array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Bubble sort the array is: ");
        Sorting(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}