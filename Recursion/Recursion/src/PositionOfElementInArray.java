import java.util.*;
class PositionOfElementInArray{
    static int LinSearch(int arr[],int idx,int tar){
        if(idx==arr.length)
            return -1;
        if(arr[idx]==tar)
            return idx;
        return LinSearch(arr,idx+1,tar);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,4,8,3,2,7,6,1,4};
        int tar,idx=0;
        System.out.println("Enter Target Element: ");
        tar=sc.nextInt();
        System.out.println("Index: "+LinSearch(arr,idx,tar));
    }
}