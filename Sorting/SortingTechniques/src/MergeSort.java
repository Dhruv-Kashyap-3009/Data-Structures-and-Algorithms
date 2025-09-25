/*Merge Sort(Divide and Conquer Method)
Divide the array into two equal halves.
Sort the two subarrays separately using recursion.
Merge the sorted subarrays to create an overall sorted array.
*/

/*
Time Complexity:-
    TC of Merge Function: O(n)
    TC of Merge Sort(including Merge Function): O(nlog(n))
*/

//Space Complexity: O(n+log(n))

//Stable Sorting Technique

import java.util.*;
class MergeSort{         //This function merge the two sorted arrays
    static void Merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else if(left[i]>right[j]){
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
    static void MergeSorting(int[] arr, int l, int r){
        int mid=(l+r)/2;
        if(l>=r)                //Base case
            return;

        MergeSorting(arr,l,mid);              //Recursive Calls
        MergeSorting(arr,mid+1,r);         //Recursive Calls

        Merge(arr,l,mid,r);                  //Self Work

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of Array: ");
        n=sc.nextInt();
        int l=0,r=n-1;
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Bubble sort the array is: ");
        MergeSorting(arr,l,r);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}