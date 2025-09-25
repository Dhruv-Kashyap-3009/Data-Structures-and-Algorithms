import java.util.*;
class ReverseAString{
    static String RevStr(String s, int idx){
        if(idx==s.length())
            return "";
        return RevStr(s,idx+1)+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int idx=0;
        System.out.println("Enter String: ");
        s=sc.nextLine();
        System.out.println("The reversed string is: "+RevStr(s,idx));
    }
}