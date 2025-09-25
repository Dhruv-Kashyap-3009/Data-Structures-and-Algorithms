import java.util.LinkedList;

class ImplementingHashmap{
    static class HashMap<K,V>{
        public static final int Default_Capacity=4;
        public static final float Default_LoadFactor=0.75f;

        private class Node{
            K key;
            V value;

            Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;

        private void initbuckets(int N){
            buckets = new LinkedList[N];
            for(int i =0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc=key.hashCode();
            return Math.abs(hc)% buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll,K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key) return i;
            }
            return -1;
        }

        public HashMap(){
            initbuckets(Default_Capacity);
        }

        public int size(){
            return n;
        }

        public void put(K key, V value){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if(ei==-1){
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            }else{
                Node currNode = currBucket.get(ei);
                currNode.value= value;
            }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if(ei!=-1){
                Node currNode=currBucket.get(ei);
                V val=currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> mp=new HashMap<>();
        mp.put("A",1);
        mp.put("B",2);
        mp.put("C",3);

        mp.put("C",30);

        System.out.println(mp.get("A"));
        System.out.println(mp.get("College"));

        System.out.println(mp.remove("C"));
        System.out.println(mp.size());

    }
}