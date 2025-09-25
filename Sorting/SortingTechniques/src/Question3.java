//Given an array where all it's elements are sorted in increasing order except two swapped elements, sort in linear time.
//Assume there are no duplicates in the array.

import java.util.*;
class Question3{
    static void swap(int[] arr,int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void Sort(int[] arr){
        int x = -1;
        int y = -1;
        if(arr.length<=1)
            return;

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1)        //First Conflicts
                    x=i-1;
                else            //Second Conflicts
                    y=i;
            }
        }
        swap(arr, x, y);
    }
    static void PrintArray(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5,6,4,8};
        System.out.println("The sorted array is:");
        Sort(arr);
        PrintArray(arr);
    }
}