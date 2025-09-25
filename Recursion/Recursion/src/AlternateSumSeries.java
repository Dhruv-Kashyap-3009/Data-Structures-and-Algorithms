// Sum=1-2+3-4+5-6+7-8

import java.util.*;
class AlternateSumSeries{
    static int Sum(int n){
        if(n==0)
            return 0;
        if(n%2==0)
            return Sum(n-1)-n;          //Even Number Subtraction
        return Sum(n-1)+n;          //Odd Number Addition
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        System.out.println("The Alternate Sum of the series is: "+Sum(n));
    }
}