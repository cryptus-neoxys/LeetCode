class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // System.out.println(Arrays.toString(nums));
        
        for(int it: nums) {
            pq.offer(it);
            if(pq.size() > k) pq.poll();
        }
        
        // System.out.println(pq);
        
        return pq.peek();
    }
}