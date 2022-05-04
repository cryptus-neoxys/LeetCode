class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        int l = 0, r = nums.length - 1;
        
        while(l < r) {
            int t = nums[l] + nums[r];
            if(t == k) {
                c++;
                l++;
                r--;
            } else if(t < k) {
                l++;
            } else {
                r--;
            }
        }
        
        return c;
    }
}