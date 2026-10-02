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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
}