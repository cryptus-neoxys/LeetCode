class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        if(n <= 1) return true;
        int s = nums[0];
        for(int i = 1; i < n; ++i) {
            if(s < i) return false;
            s = max(s, nums[i] + i);
            cout << s << " ";
        }
        cout << endl;
        return true;
    }
};