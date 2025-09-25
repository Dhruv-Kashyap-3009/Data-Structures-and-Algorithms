import java.util.*;
class SumOfElementInArray{
    static int FindSum(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }

        return arr[idx]+FindSum(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int idx=0;
        System.out.println("The Sum of Elements is: "+FindSum(arr,idx));
    }
}