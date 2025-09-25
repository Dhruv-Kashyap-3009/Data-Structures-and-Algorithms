import java.util.*;
class ReverseArraylist{
    static void Reverse(ArrayList<Integer> list){
        Integer temp;
        for(int i=0,j=list.size()-1;i<j;i++,j--){
            temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("The list is:");
        System.out.println(list);
        Reverse(list);
        System.out.println("The Reversed ArrayList is:");
        System.out.println(list);
    }
}

//--------------------------------
//Alternate Method is to import java.util.Collections;
//Use the functions Collections.reverse(list);