class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x: nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer, Integer> e: hm.entrySet()) {
            pq.add(e);
        }
        
        int[] res = new int[k];
        for(int i = 0; i < k; ++i) {
            Map.Entry<Integer, Integer> e = pq.poll();
            res[i] = e.getKey();
        }
        
        return res;
    }
}