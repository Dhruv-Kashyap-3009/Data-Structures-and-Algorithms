import java.util.*;
class AllPositionOfElement{
    static void FindIndices(int arr[],int idx, int tar){
        if(idx==arr.length)
            return;
        if(arr[idx]==tar)
            System.out.print(idx+" ");
        FindIndices(arr,idx+1,tar);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,2,5,2,7,2,9,2};
        int idx=0;
        System.out.println("Enter Target Element: ");
        int tar=sc.nextInt();
        System.out.println("All Indices are: ");
        FindIndices(arr,idx,tar);
    }
}