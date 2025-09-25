import java.util.*;
class ToggleCase{
    static void ToggleString(StringBuilder str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' ')  continue;
            boolean flag=false;

            int asci=(int)ch;
            if(asci>=97) flag=true;

            if(flag==true){
                asci-=32;
                str.setCharAt(i,(char)asci);
            }else{
                asci+=32;
                str.setCharAt(i,(char)asci);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        ToggleString(str);
    }
}