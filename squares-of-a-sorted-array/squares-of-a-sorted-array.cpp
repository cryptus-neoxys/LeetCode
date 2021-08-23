class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> res;
        int i = 0, j = nums.size() - 1;
        
        while(i <= j) {
            int iN = nums[i] * nums[i];
            int jN = nums[j] * nums[j]; 
            if(iN > jN) {
                res.push_back(iN);
                i++;
            } else {
                res.push_back(jN);
                j--;
            }
        }
        reverse(res.begin(), res.end());
        return res;
    }
};