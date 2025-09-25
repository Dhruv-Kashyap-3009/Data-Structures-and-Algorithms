import java.util.*;
class OccurenceOfElementInArray{
    static int CountOccurence(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                count++;
        }
        return count;
    }
    static void PrintArray(int arr[]){
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
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
        int x;
        System.out.println("Enter element to be searched:");
        x=sc.nextInt();
        System.out.println("The array is :");
        PrintArray(arr);
        System.out.println("The frequency of "+x+" in the array is "+CountOccurence(arr,x));
    }
}