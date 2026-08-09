class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> di = new PriorityQueue<>(Collections.reverseOrder());

        for(int val : prices) pr.add(val);
        for(int val : discounts) di.add(val);
        double sum = 0;

        while(!pr.isEmpty()){
            int p = pr.remove();
            int d = di.isEmpty()?0:di.remove();

            sum += (double)p * ((double)100 - (double)d)/(double)100;
        }

        return sum;
    }
}