//Time Complexity: O(n+max)
//Space Complexity: O(n+max)

import java.util.*;
class CountSort{
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx)
                mx=arr[i];
        }
        return mx;
    }          //Finding maximum value in the array
    static void BasicCountSort(int[] arr){
        int max=findMax(arr);

        int[] Frequency=new int[max+1];         //Making Frequency Array
        for(int i=0;i<max+1;i++){
            Frequency[arr[i]]++;
        }

        int k=0;
        for(int i=0;i<Frequency.length;i++){      //Putting elements as of their frequency
            for(int j=0;j<Frequency[i];j++){
                arr[k++]=i;
            }
        }
    }
    static void display(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,2,2,5};
        BasicCountSort(arr);
        display(arr);

    }
}