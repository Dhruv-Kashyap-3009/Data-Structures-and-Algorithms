class Solution {
    public int numberOfSubstrings(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int l=0;
        int r=0;
        Map<Character, Integer> mp = new HashMap<>();
        int count = 0;
        
        while(r<n){
            //Expansion 
            while(r<n && mp.size()<3){
                mp.put(arr[r], mp.getOrDefault(arr[r], 0) + 1);
                r++;
            }

            //Compression
            while(l<r && mp.size()==3){
                count += n-r+1;

                mp.put(arr[l], mp.get(arr[l]) - 1);
                if(mp.get(arr[l])==0) mp.remove(arr[l]);

                l++;
            }
        }

        return count;
    }
}