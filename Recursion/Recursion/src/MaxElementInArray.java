import java.util.*;
class MaxElementInArray{
    static int FindMax(int arr[],int idx){
        if(idx==arr.length)
            return 0;

        return Math.max(arr[idx],FindMax(arr,idx+1));
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,7,2,6,9,5};
        int idx=0;
        System.out.println("The Maximum element in the array is: "+FindMax(arr,idx));
    }
}