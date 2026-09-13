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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        int carry=0;

        while(c1!=null || c2!=null){
            int val1 = c1==null?0:c1.val;
            int val2 = c2==null?0:c2.val;
            int sum = (val1+val2+carry)%10;
            carry  = (val1+val2+carry)/10;

            ListNode temp = new ListNode(sum);
            curr.next = temp;
            curr = curr.next;
            if(c1!=null) c1 = c1.next;
            if(c2!=null) c2 = c2.next;
        }
        if(carry!=0){
            ListNode temp = new ListNode(carry);
            curr.next = temp;
            curr = curr.next;
            carry/=10;
        }

        return ans.next;
    }
}