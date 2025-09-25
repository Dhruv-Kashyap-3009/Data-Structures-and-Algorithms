import java.util.*;
class ReverseEachWord{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        str+=" ";
        StringBuilder s=new StringBuilder("");
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                s.append(ch);
            }else{
                s.reverse();
                ans+=s;
                ans+=" ";
                s.delete(0,s.length());
            }
        }
        System.out.println("The resultant string is: ");
        System.out.println(ans);
    }
}