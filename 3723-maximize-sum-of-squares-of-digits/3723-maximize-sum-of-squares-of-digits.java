class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder("");

        for(int i=0;i<num;i++){
            int digit = Math.min(9, sum);

            sum -= digit;

            ans.append(digit);
        }

        if(sum!=0) return "";
        else return ans.toString();
    }
}