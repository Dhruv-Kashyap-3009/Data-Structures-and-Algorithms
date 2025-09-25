class DeleteNodeGivenAsParameter {
    public static void DeleteNode(Node n) {
        n.data = n.next.data;
        n.next = n.next.next;
    }
    public static void Display(Node head){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
        DeleteNode(n4);
        System.out.println();
        Display(n1);
    }
}