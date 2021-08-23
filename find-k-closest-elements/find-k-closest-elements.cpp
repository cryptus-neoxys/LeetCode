class Solution {
public:
    // struct compRank {
    //     bool operator()(pair<int,pair<int,int>> &p1, pair<int,pair<int,int>> &p2){
    //         if(p1.first != p2.first) return p1.first < p2.first;
    //         return p1.second < p2.second;
    //     }
    // };
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        vector<int> ans;
        auto compRank = [](pair<int, int> &p1, pair<int, int> &p2){
            if(p1.first != p2.first) return p1.first < p2.first;
            return p1.second < p2.second;
        };
        priority_queue<pair<int, int>, vector<pair<int, int>>, decltype(compRank)> pq{compRank};
        
        for(int i = 0; i < arr.size(); ++i) {
            int d = abs(x-arr[i]);
            
            if(pq.size() < k) {
                pq.push({d, arr[i]});
            } else {
                if (d < pq.top().first) {
                    pq.pop();
                    pq.push({d, arr[i]});
                }
            }
        }
        
        while(!pq.empty()) {
            ans.push_back(pq.top().second);
            pq.pop();
        }
        sort(ans.begin(), ans.end());
        return ans;
    }
};