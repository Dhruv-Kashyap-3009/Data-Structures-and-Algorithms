import java.util.*;
class Factorial{
    static int Fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number :");
        n=sc.nextInt();
        System.out.println("The factorial of the number is "+Fact(n));
    }
}