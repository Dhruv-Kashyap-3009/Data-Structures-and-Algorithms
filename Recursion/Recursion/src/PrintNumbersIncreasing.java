import java.util.*;
class PrintNumbersIncreasing {
    static void Print(int n){
        if(n==1){        //Base Case or Halting Condition
            System.out.println(n);
            return;
        }
        Print(n-1);      //Recursion
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number:");
        n=sc.nextInt();
        Print(n);
    }
}