//Find the first occurrence of a element x, given that the array is sorted. If no occurrence, return -1.

import java.util.*;
class Question1{
    static int search(int [] arr,int tar){
        int st=0,end=arr.length-1,FirstOccurrence=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(tar==arr[mid]){
                FirstOccurrence=mid;
                end=mid-1;
            }else if(tar>arr[mid])
                st=mid+1;
            else if(tar<arr[mid])
                end=mid-1;
        }
        return FirstOccurrence;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,5,5,5,6,6,8,9,9,9};
        int tar;
        System.out.println("Enter the target: ");
        tar=sc.nextInt();

        int idx=search(arr,tar);
        if(idx!=-1)
            System.out.println("Element found at Index: "+idx);
        else
            System.out.println("Element not found");
    }
}