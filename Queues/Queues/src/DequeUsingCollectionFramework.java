import java.util.*;

class DequeUsingCollectionFramework {
    public static void main(String[] args) {
        Deque<Integer> Dq = new LinkedList<>();
        Dq.addLast(1);
        Dq.addLast(2);
        Dq.addLast(3);
        Dq.addLast(4);
        Dq.addLast(5);
        System.out.println(Dq);
        Dq.addFirst(0);
        System.out.println(Dq);

        Dq.removeFirst();
        Dq.removeLast();
        System.out.println(Dq);

        System.out.println(Dq.getFirst());
        System.out.println(Dq.getLast());
    }
}