import java.util.*;
class FirstNegativeInEachRowOfSizek{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,-1,-7,8,-15,30,16,28};
        int j=0;
        int n=arr.length;
        System.out.println("Enter size of Window: ");
        int k= sc.nextInt();
        int[] res=new int[n-k+1];

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) q.add(i);
        }

        for(int i=0;i<n-k+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<=i+k-1){
                res[i]=arr[q.peek()];
            }else if(q.size()==0) res[i]=0;
            else res[i]=0;
        }

        System.out.println("The resultant array is: ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}