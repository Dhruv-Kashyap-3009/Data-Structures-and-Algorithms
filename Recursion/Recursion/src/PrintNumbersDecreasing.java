import java.util.*;
class PrintNumbersDecreasing{
    static void Print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        Print(n);
    }
}