class Solution {
    private int getDigitSum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;

        Integer[] sortedArray = new Integer[n];

        for (int i = 0; i < n; i++) {
            sortedArray[i] = nums[i];
        }

        Arrays.sort(sortedArray, (a, b) -> {
            int sum1 = getDigitSum(a);
            int sum2 = getDigitSum(b);

            if (sum1 != sum2) {
                return Integer.compare(sum1, sum2);
            }

            return Integer.compare(a, b);
        });

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(nums[i], i);
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            int expectedVal = sortedArray[i];
            int currentVal = nums[i];

            if (expectedVal != currentVal) {
                int idx = mp.get(expectedVal);

                swap(nums, i, idx);

                mp.put(expectedVal, i);
                mp.put(currentVal, idx);

                swaps++;
            }
        }

        return swaps;
    }
}