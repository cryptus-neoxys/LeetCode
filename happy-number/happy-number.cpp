class Solution {
public:
    int next(int n) {
        int s = 0;
        while(n > 0) {
            int d = n % 10;
            n /= 10;
            s += d*d;
        }
        
        return s;
    }
    bool isHappy(int n) {
        int t = (n);
        int h = next(n);
        
        while(h != 1 && t != 1) {
            t = next(t);
            if(next(h) == 1) return true;
            h = next(next(h));
            if(h == t) return false;
        }
        
        return true;
    }
};