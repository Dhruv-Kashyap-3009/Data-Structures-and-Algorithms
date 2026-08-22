class Solution {
    private boolean isNum(String s){
        return !(s.equals("+") || s.equals("*") || s.equals("/") || s.equals("-"));
    }
    public int evalRPN(String[] str) {
        int n = str.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(isNum(str[i])){
                int num = Integer.parseInt(str[i]);
                st.push(num);
            }else{
                int val1 = 0;
                int val2 = 0;
                if(!st.isEmpty()) val1 = st.pop();
                if(!st.isEmpty()) val2 = st.pop();

                if(str[i].equals("*")) st.push(val1*val2);
                else if(str[i].equals("+")) st.push(val1+val2);
                else if(str[i].equals("-")) st.push(val2-val1);
                else st.push(val2/val1);
            }
        }

        return st.pop();
    }
}