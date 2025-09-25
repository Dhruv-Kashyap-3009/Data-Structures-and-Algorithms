import java.util.*;
class PartitionSumArray{
    static void PrintArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] CummArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return arr;
    }
    static boolean CheckPartition(int cumm[]){
        int sum=cumm[cumm.length-1];
        for(int i=0;i<cumm.length;i++){
            if( cumm[i] == sum-cumm[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cummulative[]=CummArray(arr);
        if(CheckPartition(cummulative)){
            System.out.println("The array can be partitioned");
        }else{
            System.out.println("The arrau cannot be partitioned");
        }
    }
}