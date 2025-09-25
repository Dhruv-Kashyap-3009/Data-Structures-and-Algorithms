import java.util.*;

class Stacks1{

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();          //Implementation using Collection Framework
        st.push(1);
        st.push(2);
        st.push(3);                          //Push
        st.push(4);
        st.push(5);

        System.out.println(st.peek());            //Peek

        System.out.println(st);                   //Printing the stack

        st.pop();                                 //Pop
        System.out.println(st);

        System.out.println("The size of the Stack is: "+st.size());

        System.out.println(st.isEmpty());          //Returns boolean value after checking if the stack is empty or not.
    }
}