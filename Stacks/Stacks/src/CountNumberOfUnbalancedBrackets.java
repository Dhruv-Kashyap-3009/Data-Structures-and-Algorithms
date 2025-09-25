import java.util.Scanner;
import java.util.Stack;

class CountNumberOfUnbalancedBrackets{

    public static int CountUnbalanced(String str){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty())
                    st.push(')');
                if(st.peek()=='(')
                    st.pop();
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();
        System.out.println("Number of Unbalanced Brackets: "+CountUnbalanced(str));
    }
}