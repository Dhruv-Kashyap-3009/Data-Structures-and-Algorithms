class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;

        Queue<Integer> q = new LinkedList<>();
        for(int val : students) q.add(val);
        int size = q.size();

        for(int i=0;i<n;i++){
            if(sandwiches[i]==q.peek()){
                q.remove();
                size--;
            }else{
                int fails = 0;

                while(fails!=size && sandwiches[i]!=q.peek()){
                    q.add(q.remove());
                    fails++;
                }

                if(fails==size) return size;
                q.remove();
                size--;
            }
        }

        return 0;
    }
}