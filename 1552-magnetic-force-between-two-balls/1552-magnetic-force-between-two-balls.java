class Solution {
    private boolean isValid(int[] position, int m, int dist) {
        int count = 1;
        int last = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= dist) {
                count++;
                last = position[i];
            }
        }

        return count >= m;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int st = 1;
        int end = position[position.length - 1] - position[0];
        int force = 0;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isValid(position, m, mid)) {
                force = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return force;
    }
}