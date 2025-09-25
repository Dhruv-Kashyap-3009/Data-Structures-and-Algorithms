import java.util.*;
class BalancedBrackets{
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty())
                    return false;
                if(st.peek()=='(')
                    st.pop();
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();
        if(isBalanced(str))
            System.out.println("String is Balanced");
        else
            System.out.println("String is not Balanced");
    }
}