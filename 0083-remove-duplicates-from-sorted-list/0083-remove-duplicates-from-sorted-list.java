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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while(curr!=null){
            ListNode remover = curr.next;
            while(remover!=null && remover.val==curr.val) remover = remover.next;

            curr.next = remover;
            curr = curr.next;
        }

        return head;
    }
}