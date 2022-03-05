class Solution {
    public int deleteAndEarn(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int n: nums) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }
        Integer k = map.firstKey();
        int r1 = k * map.remove(k);
        if(map.size() == 0) return r1;
        int k2 = map.firstKey();
        int r2 = k + 1 == k2 ? Math.max(r1, k2 * map.remove(k2)) : r1 + k2 * map.remove(k2);
        // System.out.println(map.remove(map.firstKey()) + "\n" + map.remove(map.firstKey()));
        
        for(Integer key : map.keySet()) {
            int t = r2 + key * map.get(key);
            if(k2 + 1 == key) {
                t = Math.max(r2, r1 + key * map.get(key));
            }
            r1 = r2;
            r2 = t;
            k2 = key;
        };
        
        return r2;
    }
}