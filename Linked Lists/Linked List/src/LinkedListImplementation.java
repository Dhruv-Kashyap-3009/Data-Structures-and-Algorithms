class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        int GetAt(int index){
            Node currNode=head;
            if(index>size || index<0){
                return -1;
            }

            for(int i=1;i<=index;i++){
                currNode=currNode.next;
            }
            return currNode.data;
        }
        void Add(int data){
            Node currNode=new Node(data);
            if(head==null){
                head=currNode;
                tail=currNode;
            }else{
                tail.next=currNode;
                tail=currNode;
            }
            size++;
        }
        void InsertInBetween(int index,int data){
            Node n=new Node(data);
            Node currNode=head;
            if(index==0){
                InsertAtBegin(data);
                return;
            }
            if(index==size){
                Add(data);
                return;
            }
            for(int i=1;i<=index-1;i++){
                currNode=currNode.next;
            }
            n.next=currNode.next;
            currNode.next=n;
            size++;
        }
        void InsertAtBegin(int data){
            Node currNode=new Node(data);
            if(head==null) {
                head = currNode;
                tail = currNode;
            }else {
                currNode.next = head;
                head = currNode;
            }
            size++;
        }
        void DeleteAt(int index){
            Node currNode=head;
            if(index==0){
                head=head.next;
                size--;
                return;
            }
            if(index>size || index<0){
                System.out.println("Wrong Input");
                return;
            }
            for(int i=1;i<=index-1;i++){
                currNode=currNode.next;
            }
            currNode.next=currNode.next.next;
            if(index==size-1){
                tail=currNode;
            }
            size--;
        }
        void Display(){
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+" ");
                currNode=currNode.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.Add(1);
        ll.Add(3);
        ll.Add(5);
        ll.Add(7);
        ll.Add(9);
        ll.Add(11);
        ll.DeleteAt(2);
        ll.Display();
        System.out.println("\nThe Length of the Linked List is: "+ll.size);
    }
}