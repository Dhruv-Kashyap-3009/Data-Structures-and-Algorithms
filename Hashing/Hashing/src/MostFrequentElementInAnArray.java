import java.util.*;

class MostFrequentElementInAnArray{
    static void Frequency(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();
        for(int val:arr){
            if(freq.containsKey(val)) freq.put(val, freq.get(val)+1);
            else{
                freq.put(val,1);
            }
        }

        int max=0;
        for(int key: freq.keySet()){
            if(freq.get(key)>max) max=key;
        }

        System.out.println(max+" has most frequency of "+freq.get(max));
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,4,1,3,3,3};
        Frequency(arr);
    }
}