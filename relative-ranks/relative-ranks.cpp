class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        vector<int> v2(score);
        sort(v2.begin(), v2.end());
        reverse(v2.begin(), v2.end());
        
        unordered_map<int, int> hm;
        
        int i = 1;
        for(int x: v2) {
            hm[x] = i++;
        }
        vector<string> res;
        for(int i = 0; i < score.size(); ++i) {
            int pos = hm[score[i]];
            switch(pos) {
                case 1:
                    res.push_back("Gold Medal");
                    break;
                case 2:
                    res.push_back("Silver Medal");
                    break;
                case 3:
                    res.push_back("Bronze Medal");
                    break;
                default:
                    res.push_back(to_string(pos));
            }
        }
        
        return res;
    }
};