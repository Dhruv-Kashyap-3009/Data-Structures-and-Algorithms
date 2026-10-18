class MapSum {
    Map<String, Integer> mp;
    public MapSum() {
        mp = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        mp.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for(String s : mp.keySet()){
            if(s.startsWith(prefix)) sum+= mp.get(s);
        }

        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */