class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways = 0;

        int pens = 0;

        while(cost1*pens<=total){
            int left = total - (cost1 * pens);

            ways += (long)((left/cost2)+1);
            pens++;
        }

        return ways;
    }
}