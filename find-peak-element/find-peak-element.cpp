class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int r = nums.size() - 1, l = 0;
        
        while(l < r)
        {
            int m = l + (r - l) / 2;
            if(nums[m] < nums[m + 1]) l = m + 1;
            else r = m;
        }
        
        return l;        
    }
};