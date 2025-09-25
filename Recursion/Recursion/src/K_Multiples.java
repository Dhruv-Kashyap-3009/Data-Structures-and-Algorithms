import java.util.*;
class K_Multiples{
    static void multi(int n,int k){
        if(k==1) {
            System.out.println(n);
            return;
        }
        multi(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        System.out.println("Enter number and multiple counter: ");
        n=sc.nextInt();
        k=sc.nextInt();
        multi(n,k);
    }
}