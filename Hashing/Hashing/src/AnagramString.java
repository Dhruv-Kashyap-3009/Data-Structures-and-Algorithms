import java.util.HashMap;

class AnagramString{
    static HashMap<Character, Integer> MakeFrequency(String str){
        HashMap<Character, Integer> mp =new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        return mp;
    }
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> mp=MakeFrequency(s);

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            else{
                mp.put(ch,mp.get(ch)-1);
            }
        }

        for(int i : mp.values()){
            if(i!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="silent";
        String t="listen";
        System.out.println(isAnagram(s,t));
    }
}