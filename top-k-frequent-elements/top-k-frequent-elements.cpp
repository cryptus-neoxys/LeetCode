class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        
        
        unordered_map<int,int> map;
        for(int num : nums){
            map[num]++;
        }
        
        vector<int> res;
        // pair<first, second>: first is frequency,  second is number
        priority_queue<pair<int,int>> pq; 
        for(auto it = map.begin(); it != map.end(); it++){
            pq.push(make_pair(it->second, it->first));
            if(pq.size() > (int)map.size() - k){
                res.push_back(pq.top().second);
                pq.pop();
            }
        }
        return res;
        
        
//         if (k == nums.size()) {
//             return nums;
//         }
//         auto compRank = [](pair<int, int> &p1, pair<int, int> &p2){return p1.first > p2.second;};
        
//         priority_queue<pair<int, int>, vector<pair<int, int>>, decltype(compRank)> pq{compRank};

//         unordered_map<int, int> hm;
//         for(auto x: nums) {
//             hm[x]++;
//         }
        
//         cout << endl;
//         for(auto x: hm) {
//             cout << x.first << " : " << x.second << endl;
//             pq.push({x.second, x.first});
//             if(pq.size() > k) {
//                 pq.pop();
//             }
//         }
        
//         vector<int> res(k);
//         for(int i = 0; i < k; ++i) {
//             cout << pq.top().first << " : " << pq.top().second << endl;
//             res[i] = pq.top().second;
//             pq.pop();
//         }
        
//         return res;
    }
};