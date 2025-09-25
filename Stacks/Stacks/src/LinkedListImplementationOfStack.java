class LinkedListImplementationOfStack{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        private Node head=null;
        private int size=0;

        void push(int data){
            if(head==null){
                head=new Node(data);
                size++;
                return;
            }
            Node currNode=new Node(data);
            currNode.next=head;
            head=currNode;
            size++;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.data;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }
        private void DisplayRec(Node head){
            Node currNode=head;
            if(currNode==null){
                return;
            }
            DisplayRec(currNode.next);
            System.out.print(currNode.data+" ");
        }
        void Display(){
            DisplayRec(head);
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean IsEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("The size of Stack is: "+st.size());
        st.Display();

        System.out.println("The Peeked element is: "+st.peek());

        st.pop();
        st.pop();

        System.out.println("The size of Stack is: "+st.size());
        st.Display();
        System.out.println("The Peeked element is: "+st.peek());

        System.out.println(st.IsEmpty());
    }
}