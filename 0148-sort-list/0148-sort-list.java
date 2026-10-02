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
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ListNode temp = list1;
                list1 = list1.next;
                temp.next = null;

                tail.next = temp;
                tail = tail.next;
            }else{
                ListNode temp = list2;
                list2 = list2.next;
                temp.next = null;

                tail.next = temp;
                tail = tail.next;
            }
        }
        if(list1!=null) tail.next = list1;
        if(list2!=null) tail.next = list2;

        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;

        ListNode t1 = sortList(head);
        ListNode t2 = sortList(temp);

        ListNode newHead = mergeTwoLists(t1, t2);

        return newHead;
    }
}