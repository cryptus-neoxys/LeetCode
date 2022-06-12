class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum  = 0, res = 0;
        
        int i = 0, j = 0;
        
        while(j < nums.length) {
            if(!set.contains(nums[j])) {
                set.add(nums[j]);
                sum += nums[j++];
                res = Math.max(res, sum);
            } else {
                sum -= nums[i];
                set.remove(nums[i++]);
            }
        }
        return res;
    }
}