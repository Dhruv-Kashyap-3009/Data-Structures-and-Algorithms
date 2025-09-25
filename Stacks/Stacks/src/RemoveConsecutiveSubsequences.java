import java.util.Stack;

class RemoveConsecutiveSubsequences{
    public static int[] Remove(int[] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i]){
                if(i==arr.length-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int n=st.size();
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] result=Remove(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}