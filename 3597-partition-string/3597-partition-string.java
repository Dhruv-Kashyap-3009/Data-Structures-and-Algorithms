class Solution {
    public List<String> partitionString(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();

        String temp = "";

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            temp += c;

            if(!set.contains(temp)){
                ans.add(temp);
                set.add(temp);
                temp = "";
            }
        }

        return ans;
    }
}