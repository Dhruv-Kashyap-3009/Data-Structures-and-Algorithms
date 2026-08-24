class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    boolean even;
    public MedianFinder() {
        minHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap = new PriorityQueue<>();
        even = true;
    }
    
    public void addNum(int num) {
        if(even){
            maxHeap.add(num);
            minHeap.add(maxHeap.remove());
        }else{
            minHeap.add(num);
            maxHeap.add(minHeap.remove());
        }
        even = !even;
    }
    
    public double findMedian() {
        if(even){
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }else{
            return minHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */