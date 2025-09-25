import java.util.*;
class RotatingArray{
    static void PrintArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    static void RotateArray(int arr[],int k){
        int n=arr.length;
        k = k % n;
        int j=0;
        int ans[]=new int[n];
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        PrintArray(ans);
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
        System.out.println("The array is:");
        PrintArray(arr);
        int k;
        System.out.println("Enter the times to be rotated");
        k = sc.nextInt();
        System.out.println("The rotated array is:");
        RotateArray(arr,k);
    }
}