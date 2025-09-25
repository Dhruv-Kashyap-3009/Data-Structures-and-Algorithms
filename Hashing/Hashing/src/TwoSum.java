import java.util.*;

class TwoSum{
    public static int[] TwoSumProblem(int[] arr,int target){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans={-1};
        for(int i=0;i<arr.length;i++){
            int partner= target-arr[i];
            if(mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={14,7,10,4,5,9,1,2};
        int target=13;
        int[] ans= TwoSumProblem(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}