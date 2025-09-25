//A rotated sorted array is a sorted array on which rotation operation has been performed some number of times
//Given a sorted array, find the index of the minimum element in the array.
//Follow 0-based indexing.
//It is guaranteed that all the elements are unique.

import java.util.*;
class Question2{
    static int Search(int[] arr){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]>arr[arr.length-1])
                st=mid+1;
            else if(arr[mid]<=arr[arr.length-1]){
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int ans=Search(arr);
        System.out.println("The Index of the Minimum element: "+ ans);
    }
}