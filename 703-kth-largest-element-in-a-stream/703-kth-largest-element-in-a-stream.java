class KthLargest {

    private PriorityQueue<Integer> pq;
    private int K;
    
    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<Integer>();
        K = k;
        for(int i: nums) {
            this.pq.add(i);
            if(this.pq.size() > k) this.pq.poll();
        }
    }
    
    public int add(int val) {
        // System.out.println(this.pq);
        this.pq.add(val);
        if(this.pq.size() > K) this.pq.poll();
        return this.pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */