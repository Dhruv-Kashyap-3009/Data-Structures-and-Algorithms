class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;

        int prevCol = 0;

        int beams = 0;

        for(int i=0;i<n;i++){
            int currCol = 0;

            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') currCol++;
            }

            if(currCol!=0){
                beams += prevCol*currCol;
                prevCol = currCol;
            }
        }

        return beams;
    }
}