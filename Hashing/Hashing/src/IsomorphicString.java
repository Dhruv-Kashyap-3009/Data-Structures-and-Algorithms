import java.util.*;

class IsomorphicString{
    public static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character, Character> mp =new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
            Character sch=s.charAt(i);
            Character tch=t.charAt(i);

            if(mp.containsKey(sch)){
                if(mp.get(sch)!=tch) return false;
                else if(st.add(tch)) return false;
                else{
                    mp.put(sch,tch);
                    st.add(tch);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="foo";
        String t="bar";
        System.out.println(isIsomorphic(s, t));
    }
}