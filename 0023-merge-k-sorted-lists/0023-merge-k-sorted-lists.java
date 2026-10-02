/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for(var val : lists) if(val!=null) pq.add(val);

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(!pq.isEmpty()){
            ListNode head = pq.poll();

            ListNode temp = head;
            head = head.next;
            temp.next = null;

            tail.next = temp;
            tail = tail.next;

            if(head!=null) pq.add(head);
        }

        return dummy.next;
    }
}