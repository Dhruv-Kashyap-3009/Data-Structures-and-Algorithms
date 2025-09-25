//Given an array of positive and negative integers, segregate them in linear time and constant space.
//The output should print all negative numbers, followed by all positive numbers.

import java.util.*;
class Question4{
    static void swap(int[] arr,int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void Partition(int[] arr){
        int l=0;
        int r=arr.length-1;
        int pivot=0;

        while(l<r){
            while(arr[l]<=pivot)
                l++;
            while(arr[r]>pivot)
                r--;
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    static void PrintArray(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={19, -20, 7, -4, -13, 11, -5, 3};
        System.out.println("The sorted array is: ");
        Partition(arr);
        PrintArray(arr);
    }
}