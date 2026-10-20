class Solution {
    public List<String> partitionString(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();

        StringBuilder temp = new StringBuilder();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            temp.append(c);

            String curr = temp.toString();

            if(!set.contains(curr)){
                ans.add(curr);
                set.add(curr);
                temp = new StringBuilder();
            }
        }

        return ans;
    }
}