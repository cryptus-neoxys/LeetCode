class Solution {
    public int findMaxLength(int[] nums) {
        int N = nums.length;
        int pref = 0, len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < N; ++i) {
            pref = pref + (nums[i] == 0 ? -1 : 1);
            if(pref == 0) {
                len = i + 1;
            }
            if(map.containsKey(pref)) {
                len = Math.max(len, i - map.get(pref));
            } else {
                map.put(pref, i);
            }
            
            // // _DEBUG
            // System.out.print(pref + "\t");
        }
        return len;
    }
}
// i.....        N
// 0    0   0   0   0   1   1   0   0   1   0   1   1
// 
// - 0 - 