import java.util.*;
public class CalculateSum {
    static int Sum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length ;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static void PrintArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        PrintArray(arr);
        System.out.println("The sum is "+Sum(arr));
    }
}