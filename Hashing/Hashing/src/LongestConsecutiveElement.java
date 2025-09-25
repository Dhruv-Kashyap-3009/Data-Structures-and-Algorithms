import java.util.HashSet;

class LongestConsecutiveElement{
    public static int longestConsecutive(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int n : nums){
            st.add(n);
        }
        int max=0;
        for(int num : st){
            if(!st.contains(num-1)){
                int currNum=num;
                int currStreak=1;
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                max=Math.max(max,currStreak);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {99,100,1,5,200,4,2,3};
        System.out.println(longestConsecutive(arr));
    }
}