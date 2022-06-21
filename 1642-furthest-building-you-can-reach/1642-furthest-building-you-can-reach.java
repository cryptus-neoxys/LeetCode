class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int N = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N - 1; ++i) {
            int d = heights[i + 1] - heights[i];
            if(d > 0)
                pq.add(d);
            if(pq.size() > ladders)
                bricks -= pq.poll();
            if(bricks < 0)
                return i;
        }
        return N - 1;
    }
}