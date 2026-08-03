class Solution {
    public int lastStoneWeight(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int val : arr) pq.add(val);

        while(pq.size()>1){
            int y = pq.remove();
            int x = pq.remove();

            if(y==x) continue;
            else pq.add(y-x);
        }

        return pq.size()==0?0:pq.peek();
    }
}