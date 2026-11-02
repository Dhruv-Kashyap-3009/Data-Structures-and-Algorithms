class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Long, Integer> map = new HashMap<>();
        int maxFreq = 0;

        for (int i = 0; i < wall.size(); i++) {
            long pos = 0;

            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                pos += wall.get(i).get(j);

                map.put(pos, map.getOrDefault(pos, 0) + 1);
                maxFreq = Math.max(maxFreq, map.get(pos));
            }
        }

        return wall.size() - maxFreq;
    }
}