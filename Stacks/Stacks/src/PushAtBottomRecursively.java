import java.util.*;

class PushAtBottomRecursively{
    public static void Display(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        while(temp.size()>0){
            int x=temp.pop();
            System.out.print(x+" ");
            st.push(x);
        }
    }
    public static void PushBottom(Stack<Integer> st,int data){
        if(st.size()==0){
            st.push(data);
            return;
        }
        int top=st.pop();
        PushBottom(st,data);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("The Stack is: "+st);

        System.out.println("Enter element to be pushed: ");
        int data=sc.nextInt();
        PushBottom(st,data);
        System.out.println("The Resultant Stack is: ");
        Display(st);
    }
}