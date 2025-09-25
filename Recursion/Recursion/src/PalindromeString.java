import java.util.*;
class PalindromeString{
    static boolean IsPalin(String s,int l, int r){
        if(r<l)
            return true;

        if(s.charAt(l)==s.charAt(r))
            return IsPalin(s,l+1,r-1);

        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter String: ");
        s=sc.nextLine();
        int l=0,r=s.length()-1;
        if(IsPalin(s,l,r)){
            System.out.println("The String is Palindrome.");
        }else{
            System.out.println("The string is not Palindrome.");
        }
    }
}