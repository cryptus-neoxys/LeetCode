class Solution {
    public int findMaximumXOR(int[] nums) {
        int mask = 0;
        int res = 0;
        
        for(int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            
            HashSet<Integer> s = new HashSet<>();
            for(int x: nums) {
                s.add(x & mask);
            }
            
            int temp = res | (1 << i);
            for(int x: s) {
                int required = x ^ temp;
                if(s.contains(required)) {
                    res = temp;
                    break;
                }
            }
        }
        return res;
    }
}