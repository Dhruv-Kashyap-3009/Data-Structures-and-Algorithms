//Given an array of size N conataining only 0's, 1's and 2's. Sort the array in ascending order.

import java.util.*;
class Question5{
    static void Sort(int[] arr){
        int[] count=new int[3];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    static void PrintArray(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={0,2,1,0,2,1,1,0};
        System.out.println("The sorted array is: ");
        Sort(arr);
        PrintArray(arr);
    }
}