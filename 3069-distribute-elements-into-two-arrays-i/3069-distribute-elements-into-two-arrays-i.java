class Solution {
    public int[] resultArray(int[] arr) {
        int n = arr.length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(arr[0]);
        b.add(arr[1]);

        for(int i=2;i<n;i++){
            if(a.get(a.size()-1)>b.get(b.size()-1)){
                a.add(arr[i]);
            }else{
                b.add(arr[i]);
            }
        }

        int idx = 0;
        for(int i=0;i<a.size();i++){
            arr[idx++] = a.get(i);
        }
        for(int i=0;i<b.size();i++){
            arr[idx++] = b.get(i);
        }

        return arr;
    }
}