class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(freq[b], freq[a])
        );

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                pq.add((char) i);
            }
        }

        StringBuilder str = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.remove();

            for (int i = 0; i < freq[c]; i++) {
                str.append(c);
            }
        }

        return str.toString();
    }
}