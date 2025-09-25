//1+2+3+4+5+6+7+8
import java.util.*;
class SeriesSum {
    static int Sum(int n){
        if(n==0)
            return 0;
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        System.out.println("The sum of n numbers is: "+Sum(n));
    }
}