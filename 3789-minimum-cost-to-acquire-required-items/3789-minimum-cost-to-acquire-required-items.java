class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost = 0L;

        int common = Math.min(need1, need2);

        cost += (long) common * Math.min(costBoth, cost1 + cost2);

        need1 -= common;
        need2 -= common;

        cost += (long) need1 * Math.min(costBoth, cost1);
        cost += (long) need2 * Math.min(costBoth, cost2);

        return cost;
    }
}