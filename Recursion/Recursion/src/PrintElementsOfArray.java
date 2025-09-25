import java.util.*;
class PrintElementsOfArray{
    static void PrintArray(int arr[], int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        PrintArray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int idx=0;      //Element to traverse in the array
        System.out.println("All elements in the array are: ");
        PrintArray(arr,idx);
    }
}