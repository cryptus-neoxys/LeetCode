class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0], count = 0;
        for(int n: nums) {
            if(n == candidate) {
                count++;
            } else {
                count--;
                if(count <= 0) {
                    candidate = n; count = 1;
                }
            }
        }
        
        return candidate;
    }
}