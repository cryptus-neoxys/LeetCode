class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        
        int res = 0;
        for(int x: piles) {
            pq.add(x);
            res += x;
        }
        
        int temp = 0;
        while(k-- > 0) {
            temp = pq.poll();
            pq.add(temp - temp / 2);
            res -= temp / 2;
        }
        
        return res;
    }
}