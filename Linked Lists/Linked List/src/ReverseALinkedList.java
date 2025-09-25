// We can also implement it using another class like we did LinkedListImplementation

class ReverseALinkedList{
    public static void Display(Node head){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public static Node ReverseLL(Node head){
        if(head.next==null) return head;

        Node newHead=ReverseLL(head.next);

        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);        //Creating five objects
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        n1.next = n2;                       //Way of linking the nodes
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        System.out.println("The Original Linked List is: ");
        Display(n1);
        n1=ReverseLL(n1);
        Display(n1);
    }
}