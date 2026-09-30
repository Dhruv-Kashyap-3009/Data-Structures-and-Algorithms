/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node newHead = null;
        Node tail = null;
        Node c1 = head;
        
        Map<Node, Node> mp = new HashMap<>();

        while(c1!=null){
            Node temp = new Node(c1.val);

            if(newHead==null){
                newHead = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = tail.next;
            }
            mp.put(c1, tail);
            c1 = c1.next;
        }

        c1 = head;

        while(c1!=null){
            mp.get(c1).random = mp.get(c1.random);

            c1 = c1.next;
        }

        return newHead;
    }
}