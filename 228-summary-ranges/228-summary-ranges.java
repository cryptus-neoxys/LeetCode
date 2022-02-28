class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        if(nums.length == 1) {res.add("" + nums[0]); return res;}
        int i = 0, j = 1, N = nums.length;
        if(nums[0] + 1 != nums[1]) {res.add(""+nums[0]); i = 1; j = 2;}
        while(j <= N) {
            while(j < N && nums[j-1] == nums[j] - 1) j++;
            if(j-1 == i) {
                res.add("" + nums[i]);
                i++;j++;
            } else {
                res.add(nums[i] + "->" + nums[j-1]);
                i = j;
                j += 1;
            }
        }
        
        return res;
    }
}