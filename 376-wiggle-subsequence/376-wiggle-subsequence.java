class Solution {
    public int wiggleMaxLength(int[] A) {
        int n = A.length;
        int res = 1;
        if(n == 1) return res;
        double s = A[1] - A[0];
        res += s != 0 ? 1 : 0;
        double cs = 0;
        for(int i = 2; i < n; ++i) {
            cs = A[i] - A[i-1];
            if((cs < 0 && s >=0) || (cs > 0 && s <=0)) {
                s = cs;
                res++;
            }
        }
        
        return res;
    }
}