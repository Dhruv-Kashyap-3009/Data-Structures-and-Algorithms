import java.util.*;
class SumPair{
    static void PrintArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    static int PairCalc(int arr[],int tar){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==tar)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar;
        System.out.println("Enter Target Sum");
        tar=sc.nextInt();
        System.out.println("The number of Sum Pair is " + PairCalc(arr,tar));
    }
}