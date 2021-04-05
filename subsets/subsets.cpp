class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> cache;
        vector<int> temp;
        subsets(nums, cache, temp, 0);
        return cache;
    }
private:
    void subsets(vector<int>& nums, vector<vector<int>>& cache, vector<int> &temp, int start) {
        // goal, once we reach the end, add it to the result
        if(start == nums.size()) {
            cache.push_back(temp);
            return;
        }
        // for every element we have two choices : keep it or drop it
        // choice 1, keep it
        temp.push_back(nums[start]);
        subsets(nums, cache, temp, start + 1);
        // choice 2, drop it
        temp.pop_back();
        subsets(nums, cache, temp, start + 1);
    }
};