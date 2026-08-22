class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        
        Stack<String> st = new Stack<>();

        for(int i=0;i<str.length;i++){
            if(str[i].length()==0 || str[i].equals(".")) continue;

            if(str[i].equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(str[i]);
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, "/"+st.pop());
        }

        String ans = sb.toString();
        return ans.equals("") ? "/" : ans;
    }
}