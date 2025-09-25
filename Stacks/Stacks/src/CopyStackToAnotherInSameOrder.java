import java.util.Stack;

class CopyStackToAnotherInSameOrder{
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println("Stack1: "+st1);

        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        //Copying st1 to st2 and then st2 to st3 to get the same order.
        //st1-->st2
        while(st1.size()>0){
            st2.push(st1.pop());
        }

        //st2-->st3
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        System.out.println("Stack3: "+ st3);
    }

}