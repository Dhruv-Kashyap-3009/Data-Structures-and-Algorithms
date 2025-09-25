class ArrayImplementationOfCircularQueue{
    public static class CircularQueue{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr = new int[5];

        public void add(int x) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is Full!");
            }else if(size==0){
                f=r=0;
                arr[0]=x;
            }else if(r<arr.length-1){
                arr[++r]=x;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=x;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }else{
                int val=arr[f];
                if(f==arr.length-1) f=0;
                else f++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }else return arr[f];
        }

        public boolean isEmpty(){
            if(size==0)
                return true;
            return false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }else{    //rear<front
                for(int i=f;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int j=0;j<=r;j++){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        CircularQueue q= new CircularQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();

        q.add(6);
        q.display();

        //Checking the circularity of the array
        for(int i=0;i<q.arr.length;i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}