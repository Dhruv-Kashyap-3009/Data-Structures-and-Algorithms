class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int x : nums)
            set.add(x);

        int ans = 0;
        boolean inComponent = false;

        ListNode curr = head;

        while (curr != null) {
            if (set.contains(curr.val)) {
                if (!inComponent) {
                    ans++;
                    inComponent = true;
                }
            } else {
                inComponent = false;
            }

            curr = curr.next;
        }

        return ans;
    }
}