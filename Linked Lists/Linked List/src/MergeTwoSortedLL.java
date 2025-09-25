class MergeTwoSortedLL{
    public static void Display(Node head){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public static Node MergeLL(Node head1, Node head2){
        Node head=new Node(100);
        Node currNode=head;
        Node currNode1=head1;
        Node currNode2=head2;
        while(currNode1!=null && currNode2!=null){
            if(currNode1.data<currNode2.data){
                currNode.next=currNode1;
                currNode=currNode.next;
                currNode1=currNode1.next;
            }else{
                currNode.next=currNode2;
                currNode=currNode.next;
                currNode2=currNode2.next;
            }
        }
        if(currNode1==null){
            currNode.next=currNode2;
        }
        if(currNode2==null){
            currNode.next=currNode1;
        }
        return head.next;
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
        Node n2 = new Node(3);
        Node n3 = new Node(5);        //Creating five objects
        Node n4 = new Node(8);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        Node s1 = new Node(2);
        Node s2 = new Node(4);
        Node s3 = new Node(6);
        Node s4 = new Node(7);
        s1.next=s2;
        s2.next=s3;
        s3.next=s4;
        Node HEAD = MergeLL(n1,s1);
        Display(HEAD);
    }
}