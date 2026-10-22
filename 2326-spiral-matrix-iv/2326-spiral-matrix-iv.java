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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];

        for(int[] a : mat) Arrays.fill(a, -1);

        ListNode curr = head;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(curr!=null){
            for(int j=left;j<=right && curr!=null;j++){
                mat[top][j] = curr.val;
                curr = curr.next;
            }
            top++;

            for(int i=top;i<=bottom && curr!=null;i++){
                mat[i][right] = curr.val;
                curr = curr.next;
            }
            right--;

            for(int j=right;j>=left && curr!=null;j--){
                mat[bottom][j] = curr.val;
                curr = curr.next;
            }
            bottom--;

            for(int i=bottom;i>=top && curr!=null;i--){
                mat[i][left] = curr.val;
                curr = curr.next;
            }
            left++;
        }

        return mat;
    }
}