//Given an array of names of fruits, you are supposed to sort it in lexicographical order using the selection sort.

import java.util.*;
class Question2{
    static void Sorting(String[] arr){
        int n=arr.length;
        String temp;
        for(int i=0;i<n-1;i++){
            int min_index=i;

            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index]) < 0){
                    min_index=j;
                }
            }

            temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr={"papaya","lime","watermelon","apple","mango","kiwi"};
        System.out.println("After Bubble sort the array is: ");
        Sorting(arr);
        for(String i: arr){
            System.out.print(i + " ");
        }
    }
}