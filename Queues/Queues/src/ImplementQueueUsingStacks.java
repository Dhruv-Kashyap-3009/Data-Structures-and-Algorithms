import java.util.Stack;

class ImplementQueueUsingStacks{
    public static class Queue{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        public void add(int val){
            if(st.size()==0) st.push(val);
            else{
                while(st.size()!=0){
                    helper.push(st.pop());
                }
                st.push(val);
                while(helper.size()!=0){
                    st.push(helper.pop());
                }
            }
        }

        public int remove(){
            return st.pop();
        }

        public int peek(){
            return st.peek();
        }

        public boolean isEmpty(){
            if(st.size()==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}