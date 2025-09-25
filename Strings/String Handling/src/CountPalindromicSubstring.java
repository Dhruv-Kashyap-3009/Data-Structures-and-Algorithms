import java.util.*;
class CountPalindromicSubstring{
    static boolean IsPalindrome(String str){
        int n=str.length();
        for(int i=0,j=n-1;i<=j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    static int CountPalindromic(StringBuilder str){
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                if(IsPalindrome(str.substring(i,j))) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("Number of Palindromic Substrings is: ");
        System.out.println(CountPalindromic(str));
    }
}