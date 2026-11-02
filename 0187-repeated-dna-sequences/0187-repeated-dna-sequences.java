class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();

        if(n<=10) return ans;

        for(int i=0;i<=n-10;i++){
            String dna = s.substring(i, i+10);

            if(mp.containsKey(dna) && mp.get(dna)==1){
                ans.add(dna);
            }
            mp.put(dna, mp.getOrDefault(dna, 0)+1);
        }

        return ans;
    }
}