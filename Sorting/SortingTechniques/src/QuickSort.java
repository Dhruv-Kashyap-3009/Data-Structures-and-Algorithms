/*In quick sort(Divide and Conquer Method), we take a pivot element and try to find it's deserving position and then sort all the elements such that the
elements that are less than the pivot element are before it and vice versa.
Then we sort the left and right arrays using Recursion.
*/

/*Time Complexity:
    Best Case: O(nlogn)
    Average Case: O(nlogn)
    Worst Case: O(n^2)
*/

/*Space Complexity:
    Best Case: O(logn)
    Average Case: O(logn)
    Worst Case: O(n)
*/

//Unstable Sorting Technique
import java.util.*;
class QuickSort{
    static void swap(int[] arr, int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static int Partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int elementsLTpivot = 0;
        for (int i = st+1; i <= end; i++) {
            if (arr[i] <= pivot)
                elementsLTpivot++;
        }
        int pivotIndex = st + elementsLTpivot;
        swap(arr,st,pivotIndex);

        int i = st, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void QuickSort(int[] arr, int st,int end){
        if(st>=end)
            return;

        int pi=Partition(arr,st,end);
        QuickSort(arr,st,pi-1);
        QuickSort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int[] arr= {2,5,7,6,9,4,1};
        QuickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}