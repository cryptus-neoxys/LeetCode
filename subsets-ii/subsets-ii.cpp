class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> res; vector<int> cur;
        backtrack(res, cur, nums, 0);
        return res;
    }
    
    void backtrack(vector<vector<int>> &res, vector<int> &cur, vector<int> &nums, int begin) {
        res.push_back(cur);
        for(int i = begin; i < nums.size(); ++i) {
            if(i == begin || nums[i] != nums[i-1]) {
                cur.push_back(nums[i]);
                backtrack(res, cur, nums, i+1);
                cur.pop_back();
            }
        }
    }
};