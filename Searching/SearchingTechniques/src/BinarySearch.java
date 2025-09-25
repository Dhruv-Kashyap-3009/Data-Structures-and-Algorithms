//Binary Search only works on Sorted Array.
//Divide the array into two parts and then find the target using iteration.

//Time Complexity: O(log n)
//Space Complexity: O(1)

import java.util.*;
class BinarySearch{
    static int BinSearch(int[] arr, int tar){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(tar==arr[mid])
                return mid;
            else if(tar>arr[mid])
                st=mid+1;
            else if(tar<arr[mid])
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,5,7,15,20,24,45,50,77};
        int tar;
        System.out.println("Enter the target: ");
        tar=sc.nextInt();

        int idx=BinSearch(arr,tar);
        if(idx!=-1)
            System.out.println("Element found at Index: "+idx);
        else
            System.out.println("Element not found");
    }
}