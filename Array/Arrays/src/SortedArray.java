import java.util.*;
class SortedArray{
    static void PrintArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    static boolean IsSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
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
        System.out.println("The array is:");
        PrintArray(arr);
        if(IsSorted(arr))
            System.out.println("The array is sorted");
        else{
            System.out.println("The array is not sorted");
        }
    }
}