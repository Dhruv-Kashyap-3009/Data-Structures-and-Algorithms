class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int result[] = new int[n];
        Stack<int[]> stk = new Stack<>();

        for (int i = 0; i < logs.size(); i++) {
            String[] str = logs.get(i).split(":");
            int time = Integer.parseInt(str[2]);
            
            if (!stk.isEmpty()) {
                int[] top = stk.peek();

                if (str[1].equals("start")) {
                    result[top[0]] += time - top[1];
                    stk.push(new int[]{Integer.parseInt(str[0]), time});
                } 
                else {
                    time += 1;
                    result[top[0]] += time - top[1];
                    stk.pop();
                    if (!stk.isEmpty()) stk.peek()[1] = time;
                }
            } 
            else {
                stk.push(new int[]{Integer.parseInt(str[0]), time});
            }
        }
        return result;
    }
}