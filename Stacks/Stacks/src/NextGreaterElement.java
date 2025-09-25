import java.util.Stack;

class NextGreaterElement{
    public static int[] GreaterElement(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] result=new int[n];
        result[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }
            if(st.isEmpty()) result[i]=-1;
            else result[i]=st.peek();
            st.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=GreaterElement(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}