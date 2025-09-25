import java.util.Stack;

class DisplayStack{
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
    public static void DisplayRecursive(Stack<Integer> st){                //Time Complexity:- O(n)
        if(st.size()==0) return;                                           //Space Complexity:-O(n)  due to call stack used in recursion

        int top=st.pop();
        DisplayRecursive(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        st1.push(6);
        System.out.println("The Stack is: "+st1);

        System.out.println("The Stack Iterative Printing is: ");
        Display(st1);
        System.out.println("\nThe Stack Recursive Printing is: ");
        DisplayRecursive(st1);

    }
}