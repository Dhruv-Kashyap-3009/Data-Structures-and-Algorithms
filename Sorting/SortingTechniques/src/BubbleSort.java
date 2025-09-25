//In bubble sort, we do a certain no. of passes(n-1) & in every pass, we compare the adjacent elements
//and swap them if they are not in correct order.

//In every iteration, the largest no. in the part of array to be processed gets correct position

//Time Complexity = O(n^2)
//Space Complexity = O(1)

//Stable Sorting Technique

import java.util.*;
class BubbleSort{
    static void BubbleSorting(int[] arr){
        int n= arr.length,temp=0;
        for(int i=0;i<n-1;i++){
            boolean flag=false;    //Flag checks if any swaps occured
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){  //For decreasing, change > to be <
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;   //Swap Occured
                }
                if(!flag)  //If flag is false --> no swapping -->Array is sorted
                    return;
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
        BubbleSorting(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}