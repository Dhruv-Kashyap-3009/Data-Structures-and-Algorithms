import java.util.*;
class AllPositionOfElementInArrayList{
    static ArrayList<Integer> FindIndices(int arr[],int idx, int tar,ArrayList<Integer> list){
        if(idx==arr.length)
            return list;

        if(arr[idx]==tar)
            list.add(idx);

        return FindIndices(arr,idx+1,tar,list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,2,5,2,7,2,9,2};
        ArrayList<Integer> list=new ArrayList<>();
        int idx=0;
        System.out.println("Enter Target Element: ");
        int tar=sc.nextInt();
        System.out.println("All Indices are: ");
        System.out.println(FindIndices(arr,idx,tar,list));
    }
}