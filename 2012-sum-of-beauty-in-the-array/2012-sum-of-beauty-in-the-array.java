class Solution {
    public int sumOfBeauties(int[] nums) {
    int n = nums.length;
    int minOnRight[] = new int[n];
    minOnRight[n - 1] = nums[n - 1];
	
    for(int i = n - 2; i >= 2; i--){
        minOnRight[i] = Math.min(minOnRight[i + 1], nums[i]);           
    }
    
    int maxOnLeft = nums[0];
    int ans = 0;
    for(int i = 1; i < n - 1; i++){
        if(nums[i] > maxOnLeft && nums[i] < minOnRight[i + 1]) ans += 2;
        else if(nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) ans += 1;
        maxOnLeft = Math.max(nums[i], maxOnLeft);
    }
      
    return ans; 
}
}