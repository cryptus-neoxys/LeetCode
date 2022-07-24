class Solution {
public:
    int countPairs(vector<int>& deliciousness) {
        long long int res = 0;
        int mod = 1e9 + 7;
        int pow_2s[22] = {0};
        pow_2s[0] = 1; pow_2s[1] =  2;
        for(int i = 2; i < 22; ++i) {
            pow_2s[i] = 2 * pow_2s[i-1];
        }
        unordered_map<int, int> mp;
        
        for(int it: deliciousness) {
            for(int i = 0; i < 22; ++i) {
                res = (res + mp[pow_2s[i] - it]) % mod;    
            }
            mp[it]++;
        }
        
        return res;
    }
};