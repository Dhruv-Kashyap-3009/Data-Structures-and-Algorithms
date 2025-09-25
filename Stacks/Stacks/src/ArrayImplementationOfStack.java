class ArrayImplementationOfStack{
    public static class Stack{
        private int[] arr = new int[5];         //Private:- Nobody can access it outside the class.
        private int idx=-1;

        void push(int x){
            if(IsFull()){
                System.out.println("Stack is Full !");
                return;
            }
            arr[++idx]=x;
        }

        int peek(){
            if(idx==-1){
                System.out.println("Stack is Empty !");
                return -1;
            }
            return arr[idx];
        }

        int pop(){
            if(idx==-1){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int top=arr[idx];
            arr[idx]=0;
            idx--;
            return top;
        }
         void Display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
             System.out.println();
         }

         int size(){
            return idx;
         }

         boolean IsEmpty(){
            if(idx==-1){
                return true;
            }
            return false;
         }

         boolean IsFull(){
            if(idx==arr.length-1){
                return true;
            }
            return false;
         }

         int Capacity(){
            return arr.length;
         }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("The size of Stack is: "+st.size());
        System.out.println("The Stack is: ");
        st.Display();

        System.out.println(st.peek());

        st.pop();
        st.pop();
        System.out.println("The size of Stack is: "+st.size());
        System.out.println("New Stack is: ");
        st.Display();
    }
}