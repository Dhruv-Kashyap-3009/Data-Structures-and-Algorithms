import java.util.HashMap;
import java.util.Map;

class StoreDataAndDisplayThem{
    static void HashMapMethods(){
        //Syntax
        Map<String, Integer> mp = new HashMap<>();

        //Adding Elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        //Getting the value of key from the Hashmap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));    //Returns null if key is not present

        //Changing value of a key in a Hashmap
        mp.put("Akash", 23);
        System.out.println(mp.get("Akash"));

        //Checking if a key is in the Hashmap
        mp.remove("lav");

        //Checking if a key is present in the hashmap.
        System.out.println(mp.containsKey("Yash"));
        System.out.println(mp.containsKey("lav"));

        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 22);
        mp.putIfAbsent("Yash", 22);

        //Get all keys in a Hashmap
        System.out.println(mp.keySet());

        //Gat all values in a Hashmap
        System.out.println(mp.values());

        //Get all the entries in a Hashmap
        System.out.println(mp.entrySet());

        //Traversing all entries in a Hashmap
        for(String key : mp.keySet()){
            System.out.println("Age of "+key+" is "+mp.get(key));
        }
    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}