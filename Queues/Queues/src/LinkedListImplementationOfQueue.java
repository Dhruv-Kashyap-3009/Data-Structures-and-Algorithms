class LinkedListImplementationOfQueue{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class queue{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int data){
            Node currNode = new Node(data);
            if(head==null){
                head=currNode;
                tail=currNode;
                return;
            }
            else{
                tail.next=currNode;
                tail=currNode;
            }
            size++;
        }

        public int remove(){
            if(head==null){
                System.out.println("Queue is Empty!");
                return -1;
            }
            Node currNode=head;
            head=head.next;
            size--;
            return currNode.data;
        }
        public int peek(){
            if(head==null){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty(){
            if(head==null)
                return true;
            return false;
        }

        void display1(Node head){
            Node currNode=head;
            if(currNode==null) return;
            System.out.print(currNode.data+" ");
            display1(currNode.next);
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            display1(head);
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();

        q.remove();
        q.display();

        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size);
    }
}