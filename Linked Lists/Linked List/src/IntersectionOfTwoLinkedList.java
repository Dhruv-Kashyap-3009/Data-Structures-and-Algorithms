class IntersectionOfTwoLinkedList{
    public static void Display(Node head){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }

    public static int size(Node head){
        Node currNode=head;
        int count=0;
        while(currNode!=null){
            count++;
            currNode=currNode.next;
        }
        return count;
    }

    public static Node FindIntersection(Node head1, Node head2){
        int m = size(head1);
        int n = size(head2);
        Node currNode1= head1;
        Node currNode2= head2;
        if(m>=n){
            for(int i=1;i<=m-n;i++){
                currNode1=currNode1.next;
            }
        }else{
            for(int i=1;i<=n-m;i++){
                currNode2=currNode2.next;
            }
        }
        while(currNode1!=null || currNode2!=null){
            if(currNode1==currNode2) return currNode1;
            currNode1=currNode1.next;
            currNode2=currNode2.next;
        }
        return null;
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
        n1.next = n2;                       //Way of linking the nodes
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        Node s1=new Node(10);
        Node s2=new Node(11);
        Node s3=new Node(12);
        s1.next=s2;
        s2.next=s3;
        s3.next=n4;
        System.out.println("The two Linked Lists are: ");
        Display(n1);
        Display(s1);
        System.out.print("the Intersection Point is: ");
        Node n=FindIntersection(n1,s1);
        if(n==null){
            System.out.println("null");
        }else{
            System.out.println(n.data);
        }
    }
}