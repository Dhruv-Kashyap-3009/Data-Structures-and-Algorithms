class ListNode{
    int val;
    ListNode next, prev;

    ListNode(int val){
        this.val = val;
    }
}
class MyCircularDeque {
    int k, size;
    ListNode head, tail;

    public MyCircularDeque(int k) {
        this.k = k;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public boolean insertFront(int value) {
        if(size==k) return false;

        if(head==null){
            head = new ListNode(value);
            tail = head;
        }else{
            ListNode temp = new ListNode(value);
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size==k) return false;

        if(head==null){
            head = new ListNode(value);
            tail = head;
        }else{
            ListNode temp = new ListNode(value);
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size==0) return false;

        head = head.next;
        if(head==null) tail=null;
        else head.prev = null;
        size--;

        return true;
    }
    
    public boolean deleteLast() {
        if(size==0) return false;

        tail = tail.prev;
        if(tail==null) head=null;
        else tail.next = null;
        size--;

        return true;
    }
    
    public int getFront() {
        return head==null?-1:head.val;
    }
    
    public int getRear() {
        return tail==null?-1:tail.val;
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */