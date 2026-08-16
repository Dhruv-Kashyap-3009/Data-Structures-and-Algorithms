class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;

            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;

                int k=j+1;
                int l = n-1;
                long tar = (long)target - (long)arr[i]- (long)arr[j];

                while(k<l){
                    long sum = (long)arr[k] + (long)arr[l];

                    if(sum==tar){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                    else if(sum>tar) l--;
                    else k++;
                }
            }
        }

        return ans;
    }
}