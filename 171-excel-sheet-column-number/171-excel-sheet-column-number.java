class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int p = 1;
        int n = columnTitle.length(), i =  0;
        
        while(i < n) {
            char c = columnTitle.charAt(n - i - 1);
            res += ((c - 'A') + 1) * p;
            p *= 26;
            i++;
        }
        
        return res;
    }
}