//Given a rotated sorted array of integers, which contains distinct elements and a integer target returns
//the index of the target if it is in the array.Otherwise return -1.

import java.util.*;
class Question3{
    static int Search(int[] arr,int tar){
        int st=0;
        int end=arr.length-1;

        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==tar)
                return mid;
            else if(arr[mid]<arr[end]){ //Mid to end is sorted
                if(tar>arr[mid] && tar<=arr[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(tar>=arr[st] && tar<arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={3,4,5,1,2};
        int tar;
        System.out.println("Enter the target element: ");
        tar=sc.nextInt();
        int ans=Search(arr,tar);
        System.out.println("The Index of the Target element: "+ ans);
    }
}