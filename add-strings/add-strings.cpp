class Solution {
public:
    string addStrings(string num1, string num2) {
        int i = num1.size() - 1, j = num2.size() - 1;
        string res = "";
        int c = 0;
        while(i >= 0 || j >= 0 || c) {
            int s = 0;
            if(i >= 0) {
                s += (num1[i] - '0');
                i--;
            }
            if(j >= 0) {
                s += (num2[j] - '0');
                j--;
            }
            s += c;
            c = s / 10;
            s = s % 10;
            
            res = res + to_string(s);
        }
        
        reverse(res.begin(), res.end());
        return res;
    }
};