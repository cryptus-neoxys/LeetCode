class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int n = matrix.size(), m = matrix[0].size();
        int T = 0, B = n - 1, L = 0, R = m - 1;
        int dir = 0;
        vector<int> ans;
        while(T <= B && L <= R) {
            if(dir == 0)
            {
                for(int i = L; i <= R; ++i) {
                    ans.push_back(matrix[T][i]);
                }
                T++;
            }
            if(dir == 1)
            {
                for(int i = T; i <= B; ++i) {
                    ans.push_back(matrix[i][R]);
                }
                R--;
            }
            if(dir == 2)
            {
                for(int i = R; i >= L; --i) {
                    ans.push_back(matrix[B][i]);
                }
                B--;
            }
            if(dir == 3)
            {
                for(int i = B; i >= T; --i) {
                    ans.push_back(matrix[i][L]);
                }
                L++;
            }
            dir = (dir + 1) % 4;
        }
        cout << endl;
        return ans;
    }
};