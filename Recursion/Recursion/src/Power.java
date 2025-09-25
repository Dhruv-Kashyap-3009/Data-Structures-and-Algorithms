import java.util.*;
class Power{
    static int Pow(int p,int q){
        if(q==0)
            return 1;
        if(q%2==0)
            return Pow(p,q/2) * Pow(p,q/2);
        return Pow(p,q/2) * Pow(p,q/2) * p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p,q;
        System.out.println("Enter values of p and q: ");
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("The answer is: "+Pow(p,q));
    }
}