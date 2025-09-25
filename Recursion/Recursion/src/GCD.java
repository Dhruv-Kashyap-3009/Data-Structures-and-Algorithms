//Rule of GCD(Euclid's Algorithm):-

// GCD(x,y)=GCD(y,x%y)
// GCD(x,0)=x

import java.util.*;
class GCD{
    static int gcd(int x,int y){
        if(y==0)
            return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter Numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("The GCD of the numbers is: "+gcd(n1,n2));
    }
}