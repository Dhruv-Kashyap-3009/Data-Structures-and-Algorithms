import java.util.*;

class ListInterface{
    static void ArrayListsExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);                                              //Same operations can work on both the methods because these
        l.add(2);                                              //methods are present in the List Interface
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(2));
        l.set(1,10);
        System.out.println(l);
    }
    static void LinkedListsExamples(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);                                              //Same operations can work on both the methods because these
        l.add(2);                                              //methods are present in the List Interface
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(2));
        l.set(1,10);
        System.out.println(l);
    }
    static void StackExamples(){
        Stack<Integer> l = new Stack<>();
        l.push(1);                                       //Stack has some different methods as it has some methods in it's
        l.push(2);                                       //own sub-interface
        l.push(3);
        System.out.println(l);
        System.out.println(l.peek());
        l.pop();
        System.out.println(l);
    }
    public static void main(String[] args) {
//        ArrayListsExamples();
//        LinkedListsExamples();
        StackExamples();
    }
}