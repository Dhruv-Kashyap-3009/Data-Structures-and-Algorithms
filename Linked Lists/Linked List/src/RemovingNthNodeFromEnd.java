class RemovingNthNodeFromEnd{
    public static Node DeleteNthNode(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
            if(fast==null){
                head=head.next;
                return head;
            }
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void Display(Node head){
        while(head!=null){                    //Displaying the Linked List
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
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
        n1.next = n2;                       //Way of linking the nodes
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Display(n1);
        Display(DeleteNthNode(n1,5));

    }
}