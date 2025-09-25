import java.util.*;
class RemoveAllOccurenceOfElementInString{
    static String ResultStr(String s,int idx,char ch){
        if(idx==s.length())
            return "";

        if(s.charAt(idx)==ch)
            return ResultStr(s,idx+1,ch);

        return s.charAt(idx)+ResultStr(s,idx+1,ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=0;
        String s;
        char ch;
        System.out.println("Enter String: ");
        s=sc.nextLine();
        System.out.println("Enter Target Character: ");
        ch=sc.nextLine().charAt(0);
        System.out.println("The Resultant String is: "+ResultStr(s,idx,ch));
    }
}