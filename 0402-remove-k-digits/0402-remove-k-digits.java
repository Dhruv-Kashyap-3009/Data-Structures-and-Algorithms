class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);

            while (!st.isEmpty() && st.peek() > c && k > 0) {
                st.pop();
                k--;
            }

            st.push(c);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        String ans = "";

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        return i == ans.length() ? "0" : ans.substring(i);
    }
}