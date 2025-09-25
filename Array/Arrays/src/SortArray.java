//Sort Array consisting of only 0s and 1s.

import java.util.*;
class SortArray{
    static void PrintArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] SortArray(int arr[]){
        int temp=0;
        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            if(arr[i]==1 && arr[j]==0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else if(arr[i]==0){
                i++;
            }else if(arr[j]==1){
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        PrintArray(arr);
        int sor[]=SortArray(arr);
        System.out.println("The sorted array is:");
        PrintArray(sor);
    }
}