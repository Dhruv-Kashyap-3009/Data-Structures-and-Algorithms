class DisplayLinkedList{
    public static void PrintLinkedListRecursively(Node head){
        if(head==null)
            return;

        System.out.print(head.data+" ");
        PrintLinkedListRecursively(head.next);
    }
    public static void PrintLinkedList(Node head){
        while(head!=null){                    //Displaying the Linked List
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);        //Creating five objects
        Node n4=new Node(4);
        Node n5=new Node(5);

        n1.next=n2;                       //Way of linking the nodes
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        // Linked list:- 1 --> 2 --> 3 --> 4 --> 5

        System.out.println("Printing Linked List: ");
        PrintLinkedList(n1);
        System.out.println("\nPrinting Linked List Recursively: ");
        PrintLinkedListRecursively(n1);
    }
}