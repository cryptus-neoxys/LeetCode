class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& v) {
        int r=v.size();
        int c=v[0].size();
        vector<vector<int>> t(r+1,vector<int>(c+1,0));
        if(v[0][0]==1)
            return 0;
        for(int i = 1; i <= r; ++i) {
            for(int j = 1; j <= c; ++j) {
                if(v[i-1][j-1] == 1) {
                    cout << i-1 << " " << j-1 << "= " << v[i-1][j-1] << '\n';
                    t[i][j] = 0;
                }
                else t[i][j]=t[i-1][j]+t[i][j-1];
                if(i == 1 && j == 1) t[i][j] = 1;
            }
        }
        
        // {// _DEBUG
        //     for(int i = 0; i <= r; ++i) {
        //         for(int j = 0; j <= c; ++j) {
        //             cout << t[i][j] << " ";
        //         } cout << '\n';
        //     }
        // }
        
        return t[r][c];
    }

};