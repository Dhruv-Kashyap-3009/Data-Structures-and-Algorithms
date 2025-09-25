import java.util.*;

class Queue1{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();          //Internally implemented using LinkedList
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());

        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
    }
}