class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        if(arr.size() == 1) return {-1};
        int n = arr.size()-1;
        int currMax = max(arr[n], arr[n-1]); 
        
        arr[n-1] = arr[n];
        arr[n] = -1; 
        
        n -= 2;
        for(int i = n; i >= 0; --i){
            int t = currMax; 
            if(currMax < arr[i]) currMax = arr[i]; 
            arr[i] = t;
            
        }
        
        return arr;
    }
};