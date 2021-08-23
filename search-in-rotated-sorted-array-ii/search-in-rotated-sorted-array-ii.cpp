class Solution {
public:
    bool search(vector<int>& nums, int target) {
        int beg=0,end=nums.size()-1,mid;
        
        while(beg <= end) {
            while(beg < end && nums[beg] == nums[beg+1]) ++beg;
            while(beg < end && nums[end] == nums[end-1]) --end;
            mid = (beg + end) / 2;
            if(nums[mid] == target) return true;
            
            if(nums[beg] <= nums[mid]) 
            {
                if(nums[mid] > target && nums[beg] <= target)
                    end = mid - 1;
                else beg = mid + 1;
            }
            else
            {
                if(nums[mid] < target && nums[end] >= target)
                    beg = mid + 1;
                else end = mid - 1;
            }
        }
        
        return false;
    }
};