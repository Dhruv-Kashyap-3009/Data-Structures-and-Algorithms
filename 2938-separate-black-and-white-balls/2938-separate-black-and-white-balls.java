class Solution {
    public long minimumSteps(String s) {
        long count = 0;

        int st = 0;
        int end = s.length()-1;

        while(st<end){
            if(s.charAt(st)=='1'){
                while(st<end && s.charAt(end)!='0') end--;

                count += end>st?(long)(end - st):0;
                end--;
            }
            st++;
        }

        return count;
    }
}