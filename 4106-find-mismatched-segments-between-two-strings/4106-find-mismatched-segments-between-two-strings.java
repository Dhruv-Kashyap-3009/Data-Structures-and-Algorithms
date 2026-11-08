class Solution {
    public List<List<String>> findMismatchedSegments(String s, String t) {
        List<List<String>> ans = new ArrayList<>();

        int i = 0;
        int j = 0;
        int n = s.length();
        int prev = -1;

        while(i<n && j<n){
            if(s.charAt(i)==t.charAt(j)){
                if(prev!=i-1) ans.add(new ArrayList<>(Arrays.asList(s.substring(prev+1, i), t.substring(prev+1, j))));
                prev = i;
            }
            i++;
            j++;
        }

        if(prev!=n-1) ans.add(new ArrayList<>(Arrays.asList(s.substring(prev+1, n), t.substring(prev+1, n))));

        return ans;
    }
}