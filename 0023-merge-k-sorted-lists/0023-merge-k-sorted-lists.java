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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(var node : lists){
            if(node!=null) pq.add(node);
        }

        while(!pq.isEmpty()){
            ListNode temp = pq.remove();

            ListNode newList = temp.next;
            temp.next = null;

            if(newList!=null) pq.add(newList);

            curr.next = temp;
            curr = curr.next;
        }

        return dummy.next;
    }
}