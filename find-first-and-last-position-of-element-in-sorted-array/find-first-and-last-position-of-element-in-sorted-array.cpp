class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        if(nums.size() < 1) return {-1, -1};
        // if(nums.size() == 1) return {-1, -1};
        int l = 0, r = nums.size() - 1, mid = (l + r) / 2;
        int right = -1;
        while(l <= r) {
            mid = (l + r) / 2;
            if(nums[mid] > target) {
                r = mid - 1;
            }
            else if(nums[mid] < target) {
                l = mid + 1;
            } 
            else {
                right = mid;
                l = mid + 1;
            }
        }
        cout << r << " " << l << right << endl;
        if(right == -1) return {-1, -1};
        l = 0, r = nums.size() - 1, mid = (l + r) / 2;
        int left = -1;
        while(l <= r) {
            mid = (l + r) / 2;
            if(nums[mid] > target) {
                r = mid - 1;
            }
            else if(nums[mid] < target) {
                l = mid + 1;
            } 
            else {
                left = mid;
                r = mid - 1;
            }
        }
        cout << r << " " << l << endl;
        if(left == -1) return {-1, -1};
        else return {left, right};
    }
};