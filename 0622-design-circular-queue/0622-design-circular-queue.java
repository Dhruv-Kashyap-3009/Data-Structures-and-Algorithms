class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class MyCircularQueue {
    int k;
    ListNode head;
    ListNode tail;
    int size;

    public MyCircularQueue(int k) {
        this.k = k;
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean enQueue(int value) {
        if(size==k) return false;

        if(head==null){
            head = new ListNode(value);
            tail = head;
        }else{
            ListNode temp = new ListNode(value);
            tail.next = temp;
            tail = tail.next;
        }  
        size++;

        return true;
    }
    
    public boolean deQueue() {
        if(size==0) return false;

        head = head.next;
        size--;

        if(head==null) tail = null;

        return true;
    }
    
    public int Front() {
        if(head==null) return -1;
        else return head.val;
    }
    
    public int Rear() {
        if(tail==null) return -1;
        else return tail.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */