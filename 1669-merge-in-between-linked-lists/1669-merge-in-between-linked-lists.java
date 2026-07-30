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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode tail = list2;

        while(tail!=null && tail.next!=null) tail = tail.next;

        int i = 1;
        ListNode A = list1;
        ListNode B = list1;
        while(i<=b+1){
            if(i<a && A!=null) A = A.next;

            if(B!=null) B = B.next;
            i++;
        }

        A.next = list2;
        tail.next = B;

        return list1;
    }
}