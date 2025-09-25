import java.util.*;
import java.util.Collections;

class SortStringArraylist{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Dhruv");
        list.add("Kashyap");
        System.out.println("Original ArrayList: "+list);
        Collections.sort(list);
        System.out.println("Sorted Ascending ArrayList: "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted Descending ArrayList: "+list);
    }
}