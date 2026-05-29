class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        // keep track of the size. only add if its greater than the least elem or queue is not full.
        if(minHeap.size() < k) {
            minHeap.offer(val);
        }

        else if(minHeap.peek() < val) {
            minHeap.poll();
            minHeap.offer(val);
        }
        
        return minHeap.peek();
    }
}
