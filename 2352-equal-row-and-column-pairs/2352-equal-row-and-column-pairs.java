class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int pairs = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String row = Arrays.toString(grid[i]);
            map.put(row, map.getOrDefault(row, 0) + 1);
        }
        
        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }
            String colVal = Arrays.toString(col);
            if (map.containsKey(colVal)) {
                pairs += map.get(colVal);
            }
        }
        
        return pairs;
    }
}