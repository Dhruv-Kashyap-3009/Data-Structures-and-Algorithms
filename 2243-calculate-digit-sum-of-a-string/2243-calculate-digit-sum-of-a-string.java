class Solution {
    private String sum(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum += s.charAt(i) - '0';
        }

        return String.valueOf(sum);
    }
    public String digitSum(String s, int k) {

        while(s.length() > k){
            StringBuilder str = new StringBuilder();

            for(int i=0;i<s.length();i+=k){
                int last = Math.min(s.length(), i+k);
                str.append(sum(s.substring(i, last)));
            }

            s = str.toString();
        }

        return s;
    }
}