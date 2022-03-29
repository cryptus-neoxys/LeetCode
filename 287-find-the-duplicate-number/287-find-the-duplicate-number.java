class Solution {
    public int findDuplicate(int[] nums) {
        int s = 0, f = 0;
        do {
            s = nums[s];
            f = nums[nums[f]];
            // System.out.println(nums[s] + " " + nums[f]);
        }while(s != f);
        // System.out.println();
        s = 0;
        while(nums[s] != nums[f]) {
            s = nums[s];
            f = nums[f];
            // System.out.println(nums[s] + " " + nums[f]);
        }
        
        return nums[s];
    }
}