class DLL1{
    public static void Display(Node head){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public static void DisplayRev(Node tail){
        Node currNode=tail;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.prev;
        }
        System.out.println();
    }
    public static void DisplayRandom(Node n){           //In this a Random node form between is given
        Node currNode=n;
        while(currNode.prev!=null){                      //Moving currNode backwards to head
            currNode=currNode.prev;
        }
        while(currNode!=null){                           //Now printing the Linked list
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next=n2;
        n1.prev=null;       //Optional: Default value is taken as null
        n2.next=n3;
        n2.prev=n1;
        n3.next=n4;
        n3.prev=n2;
        n4.next=n5;
        n4.prev=n3;
        n5.next=null;       //Optional: Default value is taken as null
        n5.prev=n4;
        Display(n1);
        DisplayRev(n5);
        DisplayRandom(n3);
    }
}