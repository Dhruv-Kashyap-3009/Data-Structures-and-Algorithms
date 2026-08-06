class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (k > 0) {
                for (int j = i + 1; j < i + 1 + k; j++) {
                    res[i] += code[j % n];
                }
            } else if (k < 0) {
                for (int j = i - 1; j > i - 1 - Math.abs(k); j--) {
                    res[i] += code[((j % n) + n) % n];
                }
            }
        }
        
        return res;
    }
}