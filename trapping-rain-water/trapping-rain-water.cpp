class Solution {
public:
    int trap(vector<int>& height) {
        int c = 0;
        int n = height.size();
        if(n <= 2) return 0;
        // leftmax array
        vector<int> leftmax(height.size());
        leftmax[0] = height[0];
        cout << leftmax[0] << " ";
        for(int i = 1; i < height.size(); ++i) {
            leftmax[i] = max(height[i], leftmax[i-1]);
            cout << leftmax[i] << " ";
        }
        cout << '\n';
        
        // rightmax array
        vector<int> rightmax(height.size());
        rightmax[n - 1] = height[height.size() - 1];
        cout << rightmax[n-1] << " ";
        for(int i = height.size() - 2; i >= 0 ; --i) {
            rightmax[i] = max(height[i], rightmax[i+1]);
            cout << rightmax[i] << " ";
        }
        cout << '\n';
        
        // calc res
        vector<int> resarr(height.size(), 0);
        cout << resarr[0] << " ";
        for(int i = 1; i < height.size() - 1; ++i) {
            if(height[i] < min(leftmax[i], rightmax[i])) {
                resarr[i] = min(leftmax[i], rightmax[i]) - height[i];
            }
            cout << resarr[i] << " ";
            c += resarr[i];
        }
        cout << resarr[n-1] << " ";
        
        return c;
    }
};
        