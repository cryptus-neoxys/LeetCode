class Solution {
    public int deleteAndEarn(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int p = 0, c = 0, k = -1;
        for(Integer key : map.keySet()) {
            int m = Math.max(p, c);
            if(k + 1 != key) {
                c = m + key * map.get(key);
            } else {
                c = p + key * map.get(key);
            }
            p = m;
            k = key;
        };
        
        return Math.max(p, c);
    }
}