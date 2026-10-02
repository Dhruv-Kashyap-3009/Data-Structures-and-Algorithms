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
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;

        ListNode curr = head;
        for(int i=1;i<k && curr!=null;i++) curr = curr.next;

        if(curr==null) return head;

        ListNode temp = curr.next;
        curr.next = null;

        ListNode nextHead = reverseKGroup(temp, k);
        ListNode newHead = reverse(head);

        head.next = nextHead;
        return newHead;
    }
}