class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x: stones) pq.add(x);
        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            pq.add(Math.abs(a - b));
        }
        System.out.println(pq);
        return pq.poll();
    }
}