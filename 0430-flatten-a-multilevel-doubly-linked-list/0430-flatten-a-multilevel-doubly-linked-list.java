/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;

        Node curr = head;

        while(curr!=null){
            if(curr.child!=null){
                Node next = curr.next;
                Node child = flatten(curr.child);

                Node temp = child;
                while(temp!=null && temp.next!=null) temp = temp.next;

                curr.next = child;
                child.prev = curr;
                
                if(next!=null){
                    temp.next = next;
                    next.prev = temp;
                }

                curr.child = null;
            }
            curr = curr.next;
        }

        return head;
    }
}