class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String s : sentences){
            max = Math.max(s.split(" ").length, max);
        }

        return max;
    }
}