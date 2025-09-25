//Time Complexity: O(log n)
//Space Complexity: O(log n)

import java.util.*;
class RecursiveBinarySearch{
    static int BinSearch(int[] arr, int st, int end, int tar){
        int mid=(st+end)/2;
        if(st<=end) {
            if (arr[mid] == tar)
                return mid;
            else if (arr[mid] > tar)
                return BinSearch(arr, st, mid - 1, tar);
            else if (arr[mid] < tar)
                return BinSearch(arr, mid + 1, end, tar);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,5,7,15,20,24,45,50,77};
        int tar;
        System.out.println("Enter the target: ");
        tar=sc.nextInt();

        int idx=BinSearch(arr,0,arr.length-1,tar);
        if(idx!=-1)
            System.out.println("Element found at Index: "+idx);
        else
            System.out.println("Element not found");
    }
}