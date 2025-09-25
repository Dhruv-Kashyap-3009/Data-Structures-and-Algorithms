import java.util.HashSet;

class HashSetIntroduction{
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("James");
        st.add("Scott");
        st.add("James");           //Uniqueness of elements
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.contains("James"));

    }
}