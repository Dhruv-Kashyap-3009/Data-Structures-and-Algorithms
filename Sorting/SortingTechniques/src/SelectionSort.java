//In selection sorting, we select an element and put it at it's correct position.

//Space Complexity: O(1)
//Time Complexity: O(n^2)

//Unstable Sorting Technique
import java.util.*;
class SelectionSort{
    static void SelectionSorting(int[] arr){
        int n=arr.length,min_index,temp;

        for(int i=0;i<n-1;i++){
            min_index=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index])
                    min_index=j;        //Finding the index of the minimum element.
            }

            temp=arr[min_index];
            arr[min_index]=arr[i];       //Swapping it with the first element of the processed array.
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of Array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Bubble sort the array is: ");
        SelectionSorting(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}