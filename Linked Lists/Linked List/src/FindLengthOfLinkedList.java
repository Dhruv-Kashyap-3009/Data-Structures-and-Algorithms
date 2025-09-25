class FindLengthOfLinkedList{

    public static void PrintLinkedList(Node head){
        while(head!=null){                    //Displaying the Linked List
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static int FindLength(Node head){
        Node currNode=head;
        int count=0;
        while(currNode!=null){
            count++;
            currNode=currNode.next;
        }
        return count;
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
        Node n6=new Node(6);

        n1.next=n2;                       //Way of linking the nodes
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        // Linked list:- 1 --> 2 --> 3 --> 4 --> 5 --> 6
        System.out.println("Printing Linked List: ");
        PrintLinkedList(n1);

        System.out.println("\nThe Length of the Linked List is: "+FindLength(n1));
    }
}