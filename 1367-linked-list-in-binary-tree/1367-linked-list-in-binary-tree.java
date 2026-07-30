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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean isSame(ListNode head, TreeNode root){
        if(root==null && head!=null) return false;
        if(head==null) return true;
        if(root.val!=head.val) return false;
        
        return isSame(head.next, root.left) || isSame(head.next, root.right);
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null) return true;
        if(root==null) return false;
        if(root.val==head.val){
            if(isSame(head, root)) return true;
        }

        return isSubPath(head, root.right) || isSubPath(head, root.left);
    }
}