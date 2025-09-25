//In insertion sort, we take one element, iterate through the sorted array and find the correct position of this element.

//Time Complexity: O(n^2)
//Space Complexity: O(1)

//Stable Sorting Technique

import java.util.*;
class InsertionSort{
    static void InsertionSorting(int[] arr){
        int n=arr.length,temp;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of Array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Bubble sort the array is: ");
        InsertionSorting(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}