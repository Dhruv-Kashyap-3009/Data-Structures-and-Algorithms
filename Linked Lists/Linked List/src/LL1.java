class LL1{
    public static class Node{
        int data;               // Variable to store data
        Node next;              // Variable that stores the address of next node


        Node(int data){          // Constructor
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

        System.out.println(n1.data);      //Prints the data stored in n1
        System.out.println(n2);           //Prints the address of n2
        System.out.println(n1.next);      //Prints the address of next node of n1(n2).
    }
}