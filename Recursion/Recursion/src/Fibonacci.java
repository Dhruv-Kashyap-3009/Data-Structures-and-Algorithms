import java.util.*;
class Fibonacci{
    static int Fibo(int n){
        if(n==0 || n==1)
            return n;

        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        System.out.println("Fibonacci Series is: ");
        for(int i=0;i<=n;i++){
            System.out.println(Fibo(i));
        }
    }
}