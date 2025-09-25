import java.util.*;
class QueueInterface{
    static void QueueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }
    static void PriorityQueueExamples(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();   //Default: gives priority only to the minimum element
        pq.add(5);
        pq.add(20);
        pq.add(30);
        pq.add(10);
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
    }
    static void DequeExamples(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
    public static void main(String[] args) {
//        QueueExamples();
//        PriorityQueueExamples();
        DequeExamples();
    }
}