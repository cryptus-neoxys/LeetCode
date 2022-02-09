class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }
        int res = 0;
        for(Map.Entry<Integer, Integer> it: map.entrySet()) {
            // if(set.contains(it - k)) res++;
            map.put(it.getKey(), it.getValue() - 1);
            if(map.containsKey(it.getKey() - k) && map.get(it.getKey() - k)  > 0)res++;
            map.put(it.getKey(), it.getValue() + 1);
        }
        
        return res;
    }
}