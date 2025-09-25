import java.util.*;
import java.util.Collections;

class SortArraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        System.out.println("Original ArrayList: "+list);
        Collections.sort(list);
        System.out.println("Sorted Ascending: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted Descending: "+list);
    }
}