class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int min = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        for(int x: nums) {
            if(x % 2 == 1) x *= 2;
            pq.add(-x);
            min = Math.min(min, x);
        }
        
        while(true) {
            int p = -pq.poll();
            res = Math.min(res, p - min);
            if(p % 2 == 1) break;
            min = Math.min(min, p / 2);
            pq.add(-p / 2);
        }
        
        return res;
    }
}