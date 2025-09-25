import java.util.*;
class LinearSearch{
    static boolean LinSearch(int arr[],int idx,int tar){
        if(idx==arr.length)
            return false;
        if(arr[idx]==tar)
            return true;
        return LinSearch(arr,idx+1,tar);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,4,8,3,2,7,6,1,4};
        int tar,idx=0;
        System.out.println("Enter Target Element: ");
        tar=sc.nextInt();
        if(LinSearch(arr,idx,tar))
            System.out.println("Element Present");
        else
            System.out.println("Element not Present");
    }
}