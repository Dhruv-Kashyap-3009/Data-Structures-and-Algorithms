import java.util.*;
class SumOfDigits{
    static int Sum(int n){
        if(n>=0 && n<10)
            return n;
        return (n%10)+Sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        System.out.println("The sum of the digits is "+Sum(n));
    }
}