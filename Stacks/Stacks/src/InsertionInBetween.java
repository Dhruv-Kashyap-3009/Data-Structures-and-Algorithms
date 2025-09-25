import java.util.*;

class InsertionInBetween{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println("Stack1: "+st1);

        System.out.println("Enter Element and Index in Insertion: ");
        int ele=sc.nextInt();
        int index=sc.nextInt();

        Stack<Integer> st2 = new Stack<>();
        while(st1.size()>index){
            st2.push(st1.pop());
        }
        st1.push(ele);
        while(st2.size()>0){
            st1.push(st2.pop());
        }
        System.out.println("The Resultant Stack is: "+ st1);
    }
}