class Solution {
    public int missingInteger(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int val : arr) set.add(val);

        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                sum += arr[i];
            } else {
                break;
            }
        }

        while(set.contains(sum)) sum++;

        return sum;
    }
}