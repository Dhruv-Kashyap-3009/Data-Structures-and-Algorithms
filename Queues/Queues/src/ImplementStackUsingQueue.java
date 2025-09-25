import java.util.*;

class ImplementStackUsingQueue{
    public static class Stack{
        Queue<Integer> q = new LinkedList<>();
        public void push(int val){
            q.add(val);
            for(int i=1;i<q.size();i++){
                q.add(q.remove());
            }
        }

        public int pop(){
            return q.remove();
        }

        public int peek(){
            return q.peek();
        }

        public boolean isEmpty(){
            if(q.size()==0) return true;
            return false;
        }

        public void display(){
            System.out.println(q);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();

        System.out.println(st.peek());
        st.pop();
        st.display();

        System.out.println(st.peek());
        st.pop();
        st.display();

        System.out.println(st.isEmpty());
    }
}