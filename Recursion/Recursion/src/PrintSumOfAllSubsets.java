import java.util.*;
class PrintSumOfAllSubsets{
    static void PrintSubsetsSum(int arr[],int idx,int sum){
        if(idx==arr.length) {
            System.out.println(sum);
            return;
        }
        PrintSubsetsSum(arr,idx+1,sum+arr[idx]);      //Include
        PrintSubsetsSum(arr,idx+1,sum);      //Exclude
    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        int idx=0,sum=0;
        System.out.println("The sum of all subsets are: ");
        PrintSubsetsSum(arr,idx,sum);
    }
}