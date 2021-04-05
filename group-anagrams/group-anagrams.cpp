class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> res;
        unordered_map<string,vector<string>> mp;
        
        for(string x: strs)
        {
            auto tem=x;
			sort(tem.begin(),tem.end());
			mp[tem].push_back(x);
        }
        
        for(auto x: mp)
        {
            res.push_back(x.second);
        }
        
        return res;
    }
};