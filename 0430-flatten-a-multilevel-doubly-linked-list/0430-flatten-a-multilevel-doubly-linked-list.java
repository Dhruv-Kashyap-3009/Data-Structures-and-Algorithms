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
        if (head == null) return null;

        Node curr = head;

        while (curr != null && curr.child == null) {
            curr = curr.next;
        }

        if (curr == null) return head;

        Node next = curr.next;
        Node child = curr.child;

        Node flat = flatten(child);

        curr.next = flat;
        flat.prev = curr;

        Node tail = flat;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = next;

        if (next != null) {
            next.prev = tail;
        }

        curr.child = null;

        return head;
    }
}