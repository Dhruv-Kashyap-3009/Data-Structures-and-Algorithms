class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int[] i : reservedSeats){
            map.putIfAbsent(i[0],new ArrayList<>());
            map.get(i[0]).add(i[1]);
        }
        int ans = 2*(n - map.size());
        
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            List<Integer> seats = entry.getValue();
            boolean isLeftAisle = false, isRightAisle = false, isMiddle = false;
            for(int seat : seats){
                if(seat >= 2 && seat <= 5) isLeftAisle = true;
                if(seat >= 6 && seat <= 9) isRightAisle = true;
                if(seat >=4 && seat <= 7) isMiddle = true;
                if(isLeftAisle && isRightAisle && isMiddle) break;
            }
            
            if(!isLeftAisle) ans += 1;
            if(!isRightAisle) ans += 1;
            if(isLeftAisle && isRightAisle && !isMiddle) ans += 1;
        }
        return ans;
    }
}