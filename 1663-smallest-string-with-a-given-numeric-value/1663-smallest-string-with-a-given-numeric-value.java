class Solution {
    public String getSmallestString(int n, int k) {
        k -=n;
        char[] res = new char[n];
        Arrays.fill(res, 'a');
        
        while(k > 0) {
            res[--n] += Math.min(k, 25);
            k -= Math.min(k, 25);
        }
        
        return new String(res);
    }
}